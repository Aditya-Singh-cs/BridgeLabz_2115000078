import java.util.Arrays;

public class QuickSort {
    
    // Swap function for better readability
    private static void swap(int[] prices, int i, int j) {
        int temp = prices[i];
        prices[i] = prices[j];
        prices[j] = temp;
    }

    // Partition function
    public static int partition(int prices[], int low, int high) {
        int pivot = prices[high]; // Last element as pivot
        int i = low - 1; // Index of smaller element

        for (int j = low; j < high; j++) {
            if (prices[j] < pivot) {
                i++;
                swap(prices, i, j);
            }
        }

        // Swap pivot with the element at i+1
        swap(prices, i + 1, high);
        return i + 1;
    }

    // QuickSort function
    public static void quickSort(int prices[], int low, int high) {
        if (low < high) {
            int pi = partition(prices, low, high);

            // Recursively sort elements before and after partition
            quickSort(prices, low, pi - 1);
            quickSort(prices, pi + 1, high);
        }
    }

    // Display function
    public static void displayPrices(int prices[]) {
        System.out.println(Arrays.toString(prices));
    }

    // Main method
    public static void main(String[] args) {
        int productPrices[] = {1200, 450, 3000, 700, 1500};
        
        System.out.print("Original Prices: ");
        displayPrices(productPrices);

        quickSort(productPrices, 0, productPrices.length - 1);

        System.out.print("Sorted Prices: ");
        displayPrices(productPrices);
    }
}
