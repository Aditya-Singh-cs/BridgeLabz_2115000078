import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface TaskInfo {
    String priority();
    String assignedTo();
}

// Apply @TaskInfo annotation
class TaskManager {
    @TaskInfo(priority = "High", assignedTo = "Aditya")
    public void task1() {}

    @TaskInfo(priority = "Low", assignedTo = "Yash")
    public void task2() {}
}

// Retrieve annotation details using Reflection
public class AnnotationExample {
    public static void main(String[] args) {
        for (Method method : TaskManager.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(TaskInfo.class)) {
                TaskInfo task = method.getAnnotation(TaskInfo.class);
                System.out.println(method.getName() + " - Priority: " + task.priority() + ", Assigned to: " + task.assignedTo());
            }
        }
    }
}
