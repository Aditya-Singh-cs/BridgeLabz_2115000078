import java.util.ArrayList;

public class SuppressWarningsExample {

    @SuppressWarnings("unchecked") // Suppresses unchecked warnings
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        
        list.add("Java");
        list.add("Python");
        list.add("C++");
        
        ArrayList<String> safeList = new ArrayList<>(list); 

        System.out.println("Safe List: " + safeList);
    }
}