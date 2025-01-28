import java.util.*;
class SpringSeason {
    public static boolean isSpringSeason(int month, int day) {
        if (month == 3 && day >= 20) return true;
        if (month == 4 || month == 5) return true;
        if (month == 6 && day <= 20) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	System.out.println("Enter the Month");
        int month = input.nextInt();
	System.out.println("Enter the day");
        int day = input.nextInt();
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
