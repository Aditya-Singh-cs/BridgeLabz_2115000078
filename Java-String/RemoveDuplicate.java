import java.util.*;
class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = input.nextLine();
        String result = removeDuplicates(input);
        System.out.println("Original String: " + input);
        System.out.println("String after removing duplicates: " + result);
    }
    public static String removeDuplicates(String str) {
        String result = ""; // Store the final string without duplicates
        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // If the character is not already in result, add it
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }
        return result;
    }
}
