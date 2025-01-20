import java.util.*;
class PerimeterofRectangle {
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Length");
	double l=sc.nextDouble();
	System.out.println("Enter Width");
	double w=sc.nextDouble();
	double per=2*(l+w);
	System.out.println("The Perimeter is="+per);
	}
}