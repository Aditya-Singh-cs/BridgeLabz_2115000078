import java.util.*;
class Handshakes2{
	public int numberOfHandshakes(int numberOfStudents){
	return ((numberOfStudents*(numberOfStudents-1))/2);
	}
	public static void main(String args[]){
	  Handshakes obj=new Handshakes();
	  Scanner input=new Scanner(System.in);
	  System.out.println("Enter the number of students");
	  int numberOfStudents=input.nextInt();
	  int totalHandshakes=obj.numberOfHandshakes(numberOfStudents);
	  System.out.println("Total number of HandShakes "+totalHandshakes);
	}
}
