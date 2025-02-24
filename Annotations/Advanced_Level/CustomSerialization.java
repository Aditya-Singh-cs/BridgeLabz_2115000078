import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.util.Scanner;

@Retention(RetentionPolicy.RUNTIME)
@interface JsonField {
    String name();
}

class User {
    @JsonField(name = "user_name")
    private String username;

    @JsonField(name = "user_email")
    private String email;

    @JsonField(name = "user_age")
    private int age;

    public User(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }
}

class JsonSerializer {
    public static String toJson(Object obj) {
        StringBuilder jsonString = new StringBuilder("{");
        Field[] fields = obj.getClass().getDeclaredFields();
        boolean firstField = true;

        for (Field field : fields) {
            if (field.isAnnotationPresent(JsonField.class)) {
                field.setAccessible(true);
                JsonField annotation = field.getAnnotation(JsonField.class);
                try {
                    if (!firstField) jsonString.append(", ");
                    firstField = false;
                    
                    jsonString.append("\"").append(annotation.name()).append("\": ");

                    Object value = field.get(obj);
                    if (value == null) {
                        jsonString.append("null");
                    } else if (value instanceof Number || value instanceof Boolean) {
                        jsonString.append(value);
                    } else {
                        jsonString.append("\"").append(value).append("\"");
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        jsonString.append("}");
        return jsonString.toString();
    }
}

public class CustomSerialization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        User user = new User(username, email, age);
        String json = JsonSerializer.toJson(user);

        System.out.println("Serialized JSON: " + json);
        scanner.close();
    }
}
