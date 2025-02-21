import java.io.*;
import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        String fileName = "input.txt";
        countWords(fileName);
    }

    private static void countWords(String fileName) {
        Map<String, Integer> wordCount = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\W+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCount.entrySet());
        sortedWords.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        
        System.out.println("Top 5 most frequent words:");
        sortedWords.stream().limit(5).forEach(entry ->
            System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}