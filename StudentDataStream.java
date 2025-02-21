import java.io.*;

public class StudentDataStream{
    public static void main(String[] args){
        String fileName = "studentData.bin";
        
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))){
            int rollNumber = 24;
            String name = "Aditya";
            double gpa = 8;
            
            dos.writeInt(rollNumber);
            dos.writeUTF(name);
            dos.writeDouble(gpa);
            
            System.out.println("Student details stored successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))){
            int rollNumber = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();
            
            System.out.println("Retrieved Student Details:");
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("GPA: " + gpa);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
