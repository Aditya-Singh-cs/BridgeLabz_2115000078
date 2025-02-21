import java.io.*;

public class FileHandlingReadAndWrite {
    public static void main(String[] args){
        File source = new File("Source.txt");

        if (!source.exists()){
            System.out.println("Error: Source file does not exist.");
            return;
        }

        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream("destination.txt")) {
            
            int byteData;
            while((byteData = fis.read()) != -1){
                fos.write(byteData);
            }
            System.out.println("File copied successfully.");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
