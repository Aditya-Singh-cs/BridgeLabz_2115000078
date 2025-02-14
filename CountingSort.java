class CountingSort {

    // Method to perform counting sort
    public static void countingSort(int studentAges[]) {
        if (studentAges.length == 0) return;

        // Finding min and max age dynamically
        int minAge = studentAges[0], maxAge = studentAges[0];
        for (int age : studentAges) {
            if (age < minAge) minAge = age;
            if (age > maxAge) maxAge = age;
        }

        int range = maxAge - minAge + 1;
        int[] count = new int[range];

        // Counting occurrences
        for (int age : studentAges) {
            count[age - minAge]++;
        }

        // Sorting
        int index = 0;
        for (int i = 0; i < range; i++) {
            while (count[i] > 0) {
                studentAges[index++] = i + minAge;
                count[i]--;
            }
        }
    }

    // Method to display student ages
    public static void displayAges(int studentAges[]) {
        for (int age : studentAges) {
            System.out.print(age + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String args[]) {
        int studentAges[] = {12, 15, 11, 18, 10, 10, 11, 18, 17, 17, 16, 14, 13, 17};

        System.out.println("Original Ages:");
        displayAges(studentAges);

        // Calling sorting function
        countingSort(studentAges);

        System.out.println("Sorted Ages:");
        displayAges(studentAges);
    }
}
