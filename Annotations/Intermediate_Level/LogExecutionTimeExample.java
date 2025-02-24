import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// Define @LogExecutionTime annotation
@Retention(RetentionPolicy.RUNTIME)
@interface LogExecutionTime {}

class MethodExecution {

    @LogExecutionTime
    public void method1() throws InterruptedException {
        Thread.sleep(500);
    }

    @LogExecutionTime
    public void method2() throws InterruptedException {
        Thread.sleep(1000);
    }

    public void method3() throws InterruptedException {
        Thread.sleep(300);
    }
}

// Measure execution time
public class LogExecutionTimeExample {
    public static void main(String[] args) throws Exception {
        MethodExecution execution = new MethodExecution();

        for (Method method : MethodExecution.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                long start = System.nanoTime();
                method.invoke(execution);
                long end = System.nanoTime();
                System.out.println(method.getName() + " executed in " + (end - start) / 1_000_000 + " ms");
            }
        }
    }
}
