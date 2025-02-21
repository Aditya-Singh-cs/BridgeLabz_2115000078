import java.io.*;

public class UserInputToFile{
    public static void main(String[] args){
		
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            
            System.out.print("Enter your name: ");
            String name = br.readLine();
            
            System.out.print("Enter your age: ");
            String age = br.readLine();
            
            System.out.print("Enter your favorite programming language: ");
            String language = br.readLine();
            
            String userData = "Name: " +name + "\n" + "Age: " +age + "\n" + "Favorite Programming Language: " +language;
            
            try (FileWriter fw = new FileWriter("userData.txt")){
                fw.write(userData);
            }
            
            System.out.println("User data saved successfully in userData.txt.");
            
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
