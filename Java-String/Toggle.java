import java.util.Scanner;

class Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String toggledString = toggleCase(input);
        System.out.println("String after toggling the case: " + toggledString);
    }
    public static String toggleCase(String str) {
        String result = ""; 
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); 

            // Toggle the case
            if (ch >= 'A' && ch <= 'Z') {
                result += (char) (ch + 32); // Convert to lowercase
            } else if (ch >= 'a' && ch <= 'z') {
                result += (char) (ch - 32); // Convert to uppercase
            } else {
                result += ch; // Non-alphabet characters remain unchanged
            }
        }
        return result; 
    }
}
