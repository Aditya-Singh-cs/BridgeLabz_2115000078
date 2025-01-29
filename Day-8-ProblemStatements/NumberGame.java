import java.util.*;
class NumberGame {    
    public static int generateGuess(int low, int high) {
        Random rand = new Random();
        return rand.nextInt(high - low + 1) + low;
    }
    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        int low = 1, high = 100;
        int guess;
        char feedback;
        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it");
        System.out.println("'H' if number is too high, 'L' if it's too low, and 'C' if it's correct.");
        while (true) {
            guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "? (H/L/C): ");
            feedback = scanner.next().charAt(0);
            if (feedback == 'C' || feedback == 'c') {
                System.out.println("Your number is "+guess);
                break;
            } else if (feedback == 'H' || feedback == 'h') {
                high = guess - 1;
            } else if (feedback == 'L' || feedback == 'l') {
                low = guess + 1;
            } else {
                System.out.println("Invalid input. Please enter H, L, or C.");
            }

            if (low > high) {
                System.out.println("Start Again");
                break;
            }
        }
    }
    public static void main(String[] args) {
        playGame();
    }
}
