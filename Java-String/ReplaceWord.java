import java.util.Scanner;
class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter the word to replace: ");
        String oldWord = sc.next();

        System.out.print("Enter the new word: ");
        String newWord = sc.next();

        // Call the method to replace the word
        String modifiedSentence = replaceWord(sentence, oldWord, newWord);

        // Display the result
        System.out.println("Modified Sentence: " + modifiedSentence);
    }

    // Method to replace words manually
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        String[] words = sentence.split(" ");  // Split the sentence into words
        String result = "";  // Empty string to store the new sentence
        // Loop through each word and replace if it matches oldWord
        for (String word : words) {
            if (word.equals(oldWord)) {
                result += newWord + " ";  // Replace word
            } else {
                result += word + " ";  // Keep original word
            }
        }
        return result.trim();  // Trim to remove extra spaces
    }
}
