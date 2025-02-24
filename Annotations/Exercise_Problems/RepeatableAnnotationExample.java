import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Repeatable;
import java.lang.reflect.Method;

// Define repeatable annotation @BugReport
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(BugReports.class)
@interface BugReport {
    String description();
}

@Retention(RetentionPolicy.RUNTIME)
@interface BugReports {
    BugReport[] value();
}

// Apply multiple @BugReport annotations
class TaskManager {
    @BugReport(description = "Bug 1: Null pointer exception.")
    @BugReport(description = "Bug 2: Performance issue.")
    public void task() {}
}

// Retrieve and print all bug reports
public class RepeatableAnnotationExample {
    public static void main(String[] args) throws NoSuchMethodException {
        for (BugReport bug : TaskManager.class.getMethod("task").getAnnotationsByType(BugReport.class)) {
            System.out.println(bug.description());
        }
    }
}
