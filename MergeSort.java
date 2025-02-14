import java.util.Arrays;

class MergeSort {
    
    // Function to copy elements into temporary arrays
    private static void copyArray(int[] prices, int[] leftArr, int[] rightArr, int left, int mid) {
        for (int i = 0; i < leftArr.length; i++)
            leftArr[i] = prices[left + i];

        for (int j = 0; j < rightArr.length; j++)
            rightArr[j] = prices[mid + 1 + j];
    }

    // Merge function to merge two sorted subarrays
    public static void merge(int prices[], int left, int mid, int right) {
        int n1 = mid - left + 1; // Size of left subarray
        int n2 = right - mid;     // Size of right subarray

        // Create temporary arrays
        int leftArr[] = new int[n1];
        int rightArr[] = new int[n2];

        // Copy data to temp arrays
        copyArray(prices, leftArr, rightArr, left, mid);

        // Merge the two subarrays
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                prices[k++] = leftArr[i++];
            } else {
                prices[k++] = rightArr[j++];
            }
        }

        // Copy remaining elements of leftArr[]
        while (i < n1) prices[k++] = leftArr[i++];

        // Copy remaining elements of rightArr[]
        while (j < n2) prices[k++] = rightArr[j++];
    }

    // Merge Sort function
    public static void mergeSort(int prices[], int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2; // Find the middle point

            // Recursively sort both halves
            mergeSort(prices, left, mid);
            mergeSort(prices, mid + 1, right);

            // Merge the sorted halves
            merge(prices, left, mid, right);
        }
    }

    // Display function
    public static void displayPrices(int prices[]) {
        System.out.println(Arrays.toString(prices));
    }

    // Main method to test sorting
    public static void main(String[] args) {
        int bookPrices[] = {450, 120, 700, 350, 600, 200};

        System.out.print("Original Prices: ");
        displayPrices(bookPrices);

        mergeSort(bookPrices, 0, bookPrices.length - 1);

        System.out.print("Sorted Prices: ");
        displayPrices(bookPrices);
    }
}
