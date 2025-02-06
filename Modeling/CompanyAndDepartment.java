import java.util.*;

// Employee class
class Employee {
    private String name;
    private int id;
    private String position;

    public Employee(String name, int id, String position) {
        this.name = name;
        this.id = id;
        this.position = position;
    }

    public String toString() {
        return name + " (ID: " + id + ", Position: " + position + ")";
    }
}

// Department class
class Department {
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public String toString() {
        return "Department: " + name + "\nEmployees: " + employees + "\n";
    }
}

// Company class
class Company {
    private String name;
    private List<Department> departments = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public String toString() {
        return "Company: " + name + "\nDepartments:\n" + departments;
    }
}

// Main class
class CompanyAndDepartment {
    public static void main(String[] args) {
        Company company = new Company("Capgemini");

        Department hr = new Department("HR");
        Department tech = new Department("Tech");

        Employee e1 = new Employee("Aditya", 101, "HR Manager");
        Employee e2 = new Employee("Yash", 102, "Tech Lead");

        hr.addEmployee(e1);
        tech.addEmployee(e2);

        company.addDepartment(hr);
        company.addDepartment(tech);

        System.out.println(company);
    }
}
