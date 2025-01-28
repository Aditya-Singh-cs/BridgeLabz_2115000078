import java.util.Random;
class EmployeeBonusCalculator{
    public static void main(String[] args){
        int numEmployees = 10;
        double[][] employeeData = generateEmployeeData(numEmployees);
        double[][] updatedData = calculateBonus(employeeData);
        displaySummary(employeeData, updatedData);
    }

    public static double[][] generateEmployeeData(int numEmployees){
        double[][] data = new double[numEmployees][2];
        Random random = new Random();
        
        for (int i=0; i<numEmployees; i++){
            data[i][0] = 10000 + random.nextInt(90000);
            data[i][1] = 1 + random.nextInt(10);
        }
        return data;
    }

    public static double[][] calculateBonus(double[][] employeeData){
        int numEmployees = employeeData.length;
        double[][] updatedData = new double[numEmployees][2];
        
        for (int i=0; i<numEmployees; i++){
            double salary = employeeData[i][0];
            double years = employeeData[i][1];
            double bonusPercentage = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusPercentage;
            double newSalary = salary + bonus;
            
            updatedData[i][0] = newSalary;
            updatedData[i][1] = bonus;
        }
        return updatedData;
    }

    public static void displaySummary(double[][] employeeData, double[][] updatedData){
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.printf("%-10s %-15s %-15s %-15s %-15s\n", "Emp ID", "Old Salary", "Years of Service", "Bonus", "New Salary");
        System.out.println("-----------------------------------------------------------------------------------");
        
        for (int i=0; i<employeeData.length; i++){
            double oldSalary = employeeData[i][0];
            double years = employeeData[i][1];
            double newSalary = updatedData[i][0];
            double bonus = updatedData[i][1];
            
            System.out.printf("%-10d %-15.2f %-15.0f %-15.2f %-15.2f\n", (i + 1), oldSalary, years, bonus, newSalary);
            
            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
        }
        
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.printf("%-10s %-15.2f %-15s %-15.2f %-15.2f\n", "Total", totalOldSalary, "-", totalBonus, totalNewSalary);
        System.out.println("-----------------------------------------------------------------------------------");
    }
}
