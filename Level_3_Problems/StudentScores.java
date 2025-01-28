import java.util.*;
class StudentScores {
    public static int[][] generateScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = rand.nextInt(100);  // Random score for Physics
            scores[i][1] = rand.nextInt(100);  // Random score for Chemistry
            scores[i][2] = rand.nextInt(100);  // Random score for Maths
        }
        return scores;
    }
    public static Object[] calculateResults(int[][] scores, int numStudents) {
        double[][] results = new double[numStudents][4]; // Total, Average, Percentage
        String[] grades = new String[numStudents];
        String[] remarks = new String[numStudents];
        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
            if (percentage >= 80) {
                grades[i] = "A";
                remarks[i] = "Level 4, above agency-normalized standards";
            } else if (percentage >= 70) {
                grades[i] = "B";
                remarks[i] = "Level 3, at agency-normalized standards";
            } else if (percentage >= 60) {
                grades[i] = "C";
                remarks[i] = "Level 2, below, but approaching agency-normalized standards";
            } else if (percentage >= 50) {
                grades[i] = "D";
                remarks[i] = "Level 1, well below agency-normalized standards";
            } else if (percentage >= 40) {
                grades[i] = "E";
                remarks[i] = "Level 1-, too below agency-normalized standards";
            } else {
                grades[i] = "R";
                remarks[i] = "Remedial Standards";
            }
        }
        return new Object[]{results, grades, remarks};
    }
    public static void displayScorecard(int[][] scores, double[][] results, String[] grades, String[] remarks, int numStudents) {
        System.out.println("Scorecard:");
        System.out.println("----------------------------------------------------");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade\tRemarks");
        System.out.println("----------------------------------------------------");
        for (int i = 0; i < numStudents; i++) {
            System.out.print((i + 1) + "\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(scores[i][j] + "\t\t");
            }
            System.out.print(results[i][0] + "\t");
            System.out.print(results[i][1] + "\t");
            System.out.print(results[i][2] + "%\t");
            System.out.print(grades[i] + "\t");
            System.out.println(remarks[i]);
        }
        System.out.println("----------------------------------------------------");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        int[][] scores = generateScores(numStudents);
        Object[] resultsData = calculateResults(scores, numStudents);
        double[][] results = (double[][]) resultsData[0];
        String[] grades = (String[]) resultsData[1];
        String[] remarks = (String[]) resultsData[2];
        displayScorecard(scores, results, grades, remarks, numStudents);
    }
}
