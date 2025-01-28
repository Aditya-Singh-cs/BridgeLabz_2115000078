import java.util.*;
class Handshakes{
	public int numberOfHandshakes(int students){
	return ((students*(students-1))/2);
	}
	public static void main(String args[]){
	  Handshakes obj=new Handshakes();
	  Scanner input=new Scanner(System.in);
	  System.out.println("Enter the number of students");
	  int students=input.nextInt();
	  int totalHandshakes=obj.numberOfHandshakes(students);
	  System.out.println("Total number of HandShakes "+totalHandshakes);
	}
}
