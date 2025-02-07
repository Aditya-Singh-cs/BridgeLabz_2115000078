class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    int duration; // Duration in months

    Intern(String name, int id, double salary, int duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + duration + " months");
    }
}

class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee manager = new Manager("Aditya", 101, 100000, 10);
        Employee developer = new Developer("Yash", 102, 60000, "Java");
        Employee intern = new Intern("Adarsh", 103, 15000, 6);

        System.out.println("Manager Details:");
        manager.displayDetails();
        System.out.println("\nDeveloper Details:");
        developer.displayDetails();
        System.out.println("\nIntern Details:");
        intern.displayDetails();
    }
}
