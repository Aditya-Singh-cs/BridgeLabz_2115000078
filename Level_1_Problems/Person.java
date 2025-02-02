import java.util.Scanner;
class Person{
    private String name;
    private int age;

    //Parameterized constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Copy constructor
    public Person(Person other){
        this.name = other.name;
        this.age = other.age;
    }

    public void displayInfo(){
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
    }

    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the name of the person : ");
		String personName = scanner.next();
		System.out.print("Enter the age of the person : ");
		int personAge = scanner.nextInt();
		
        //Using parameterized constructor
        Person person1 = new Person(personName, personAge);
        person1.displayInfo();

        System.out.println();

        //Copy of person1 using the copy constructor
        Person person2 = new Person(person1);
        person2.displayInfo();
    }
}
