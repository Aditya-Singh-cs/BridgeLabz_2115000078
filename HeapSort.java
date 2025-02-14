import java.util.Arrays;

class HeapSort {

    // Utility function to swap two elements in an array
    private static void swap(int[] salaries, int i, int j) {
        int temp = salaries[i];
        salaries[i] = salaries[j];
        salaries[j] = temp;
    }

    // Heapify function to maintain the max heap property
    public static void heapify(int salaries[], int size, int index) {
        int largest = index; // Assume root is the largest
        int left = 2 * index + 1; // Left child index
        int right = 2 * index + 2; // Right child index

        // If left child is larger than root
        if (left < size && salaries[left] > salaries[largest]) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < size && salaries[right] > salaries[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != index) {
            swap(salaries, index, largest);
            heapify(salaries, size, largest); // Recursively heapify affected subtree
        }
    }

    // Heap Sort implementation
    public static void heapSort(int salaries[]) {
        int size = salaries.length;

        // Step 1: Build Max Heap
        for (int index = size / 2 - 1; index >= 0; index--) {
            heapify(salaries, size, index);
        }

        // Step 2: Extract elements from heap one by one
        for (int index = size - 1; index > 0; index--) {
            // Move current root to end
            swap(salaries, 0, index);
            heapify(salaries, index, 0); // Call max heapify on the reduced heap
        }
    }

    // Display function
    public static void displaySalaries(int salaries[]) {
        System.out.println(Arrays.toString(salaries));
    }

    // Main method for testing
    public static void main(String[] args) {
        int salaries[] = {50000, 70000, 40000, 90000, 65000};

        System.out.print("Original Salaries: ");
        displaySalaries(salaries);

        heapSort(salaries);

        System.out.print("Sorted Salaries: ");
        displaySalaries(salaries);
    }
}
