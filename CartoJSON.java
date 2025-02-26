import com.fasterxml.jackson.databind.ObjectMapper;

class Car {
   public String brand;
   public String model;
   public int year;

   public Car(String brand, String model, int year) {
       this.brand = brand;
       this.model = model;
       this.year = year;
   }
}

public class CartoJSON{
   public static void main(String[] args) throws Exception {
       ObjectMapper objectMapper = new ObjectMapper();

       // Create a Car object
       Car car = new Car("Tesla", "Model S", 2022);

       // Convert to JSON
       String jsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(car);
       System.out.println(jsonString);
   }
}
