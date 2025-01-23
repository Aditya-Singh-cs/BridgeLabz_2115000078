import java.util.*;
class PercentageAndGrade{
	public static void main(String args[]){
	  Scanner input=new Scanner(System.in);
	  System.out.println("Enter marks of physics");
	  double physics=input.nextDouble();
	  System.out.println("Enter marks of chemistry");
	  double chemistry=input.nextDouble();
	  System.out.println("Enter marks of maths");
	  double maths=input.nextDouble();
	  double percent=((maths+physics+chemistry)/300)*100;
	  if(percent>=80){
		System.out.println("Your Average Marks is:"+percent+"\nGrade : A \nRemarks:Level 4,above agency-normalized standards");
	  }
	  else if(percent >=70 && percent<80){
		System.out.println("Your Average Marks is"+percent+"\nGrade : B \nRemarks:Level 3,at agency-normalized standards");
          }
	  else if(percent >=60 && percent<70){
                System.out.println("Your Average Marks is"+percent+"\nGrade : C \nRemarks:Level 2,below, but approaching agency-normalized standards");
          }
	  else if(percent >=50 && percent<60){
                System.out.println("Your Average Marks is"+percent+"\nGrade : D \nRemarks:Level 1,well below agency-normalized standards");
          }
	  else if(percent >=40 && percent<50){
                System.out.println("Your Avergae Marks is"+percent+"Grade : E \nRemarks:Level 1-,too below agency-normalized standards");
          }
	  else{
		System.out.println("Your Average Marks is"+percent+"Grade :R \nRemarks:Remedial Standards");
	  }
	}
}
