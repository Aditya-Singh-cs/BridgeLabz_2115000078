import java.util.*;
class BubbleSort{
	//Method to sort
	public int[] sorting(int[] marks){
	for (int i = 0; i < marks.length - 1; i++) {
    for (int j = 0; j < marks.length - i - 1; j++) {
        if (marks[j] > marks[j + 1]) {  
            int temp = marks[j];
            marks[j] = marks[j + 1];
            marks[j + 1] = temp;
        }
    }
}

	 return marks;
	}
	//Method to display result
	void displayMarks(int[] sortedMarks){
		for(int i:sortedMarks){
			System.out.print(i+" ");
		}
	}
	
	//Main Method
	public static void main(String args[]){
	Scanner input=new Scanner(System.in);
	//Creating Object
	BubbleSort obj1=new BubbleSort();
	//Taking the size of array as input
	int size=0;
	System.out.println("Enter the number of Students");
	size=input.nextInt();
	
	int marks[]=new int[size];
	//Taking Marks for each Student
	for(int i=0;i<size;i++){
		System.out.println("Enter the mark of Students "+ (i+1));
		marks[i]=input.nextInt();
	}
	//BubbleSort
	int[] sortedMarks=obj1.sorting(marks);
	//Displaying Result
	obj1.displayMarks(sortedMarks);
	}
}