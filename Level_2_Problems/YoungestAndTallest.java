import java.util.*;
class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Amar's age: ");
        int ageAmar = input.nextInt();
        System.out.print("Enter Akbar's age: ");
        int ageAkbar = input.nextInt();
        System.out.print("Enter Anthony's age: ");
        int ageAnthony = input.nextInt();
        System.out.print("Enter Amar's height (in cm): ");
        int heightAmar = input.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        int heightAkbar = input.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        int heightAnthony = input.nextInt();
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        int tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String youngest = (youngestAge == ageAmar) ? "Amar" :(youngestAge == ageAkbar) ? "Akbar" : "Anthony";
        String tallest = (tallestHeight == heightAmar) ? "Amar" :(tallestHeight == heightAkbar) ? "Akbar" : "Anthony";
        System.out.println("The youngest friend is: " + youngest + " with age " + youngestAge);
        System.out.println("The tallest friend is: " + tallest + " with height " + tallestHeight + " cm");
    }
}
