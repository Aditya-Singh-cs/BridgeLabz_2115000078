import java.util.*;
class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine().toLowerCase();
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine().toLowerCase();
        if (areAnagrams(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }

    public static boolean areAnagrams(String str1, String str2) {
        str1 = normalize(str1);
        str2 = normalize(str2);

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        manualSort(charArray1);
        manualSort(charArray2);

        for (int i = 0; i < charArray1.length; i++) {
            if (charArray1[i] != charArray2[i]) {
                return false;
            }
        }
        return true;
    }

    public static String normalize(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void manualSort(char[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}