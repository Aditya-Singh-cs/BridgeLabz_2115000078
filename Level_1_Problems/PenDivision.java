class PenDivision{
	public static void main(String args[]){
		int numberOfPens=14,numberOfStudents=3;
		int distributed=numberOfPens/numberOfStudents;
		int remaining=numberOfPens%numberOfStudents;
		System.out.println("The Pen Per Student is "+distributed+" and the remaining pen not distributed is "+remaining);
	}
}
