import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentJSON{
   public static void main(String[] args) throws Exception {
       ObjectMapper objectMapper = new ObjectMapper();

       // Creating a Student JSON object using HashMap
       Map<String, Object> student = new HashMap<>();
       student.put("name", "Aditya");
       student.put("age", 20);
       student.put("subjects", Arrays.asList("Math", "Science", "History"));

       // Convert to JSON string
       String jsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
       System.out.println(jsonString);
   }
}
