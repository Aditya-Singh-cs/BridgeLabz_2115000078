import java.util.Arrays;

class SelectionSort {
    
    // Selection Sort function
    public static void selectionSort(int scores[]) {
        int size = scores.length;
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i; // Assume the first element is the minimum

            // Find the minimum element in the unsorted part
            for (int j = i + 1; j < size; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first unsorted element
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }

    // Display function
    public static void displayScores(int scores[]) {
        System.out.println(Arrays.toString(scores));
    }

    // Main method to test sorting
    public static void main(String[] args) {
        int examScores[] = {85, 60, 95, 70, 80};
        
        System.out.print("Original Scores: ");
        displayScores(examScores);
        
        selectionSort(examScores);
        
        System.out.print("Sorted Scores: ");
        displayScores(examScores);
    }
}
