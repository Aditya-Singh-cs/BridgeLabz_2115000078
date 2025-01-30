import java.util.Scanner;
class SubstringOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainString = sc.nextLine();

        System.out.print("Enter the substring: ");
        String substring = sc.nextLine();

        // Call the method to count occurrences of the substring
        int count = countSubstringOccurrences(mainString, substring);
        System.out.println("The substring occurs " + count + " times.");
    }

    // Method to count occurrences of the substring in the main string without using indexOf
    public static int countSubstringOccurrences(String mainString, String substring) {
        int count = 0;
        int subLength = substring.length();
        int mainLength = mainString.length();

        // Loop through the main string and check for substring matches manually
        for (int i = 0; i <= mainLength - subLength; i++) {
            boolean match = true;
            for (int j = 0; j < subLength; j++) {
                if (mainString.charAt(i + j) != substring.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                count++;
            }
        }
        return count;
    }
}
