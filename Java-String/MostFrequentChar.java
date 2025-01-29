import java.util.*;
class MostFrequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();    
        // Call the method to find the most frequent character
        char result = findMostFrequentCharacter(input);
        System.out.println("Most Frequent Character: '" + result + "'");
    }
    // Method to find the most frequent character in a string
    public static char findMostFrequentCharacter(String str) {
        int maxCount = 0; 
        char mostFrequentChar = str.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            int count = 0;
            // Count occurrences of the current character
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == currentChar) {
                    count++;
                }
            }
            // Update most frequent character if a new max is found
            if (count > maxCount) {
                maxCount = count;
                mostFrequentChar = currentChar;
            }
        }
        return mostFrequentChar;
    }
}
