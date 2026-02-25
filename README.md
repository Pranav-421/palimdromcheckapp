import java.util.Scanner;

public class UseCase4PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.示);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert to lowercase and remove non-alphanumeric characters for a robust check
        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Step 1: Convert String to Character Array
        char[] charArray = cleanInput.toCharArray();

        // Step 2: Initialize Two Pointers
        int left = 0;
        int right = charArray.length - 1;
        boolean isPalindrome = true;

        // Step 3: Compare characters from both ends
        while (left < right) {
            if (charArray[left] != charArray[right]) {
                isPalindrome = false;
                break; // Exit loop early if a mismatch is found
            }
            left++;  // Move forward
            right--; // Move backward
        }

        // Step 4: Display Result
        if (isPalindrome && cleanInput.length() > 0) {
            System.out.println("Result: \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a palindrome.");
        }

        scanner.close();
    }
}import java.util.Scanner;

public class UseCase4PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.示);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert to lowercase and remove non-alphanumeric characters for a robust check
        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Step 1: Convert String to Character Array
        char[] charArray = cleanInput.toCharArray();

        // Step 2: Initialize Two Pointers
        int left = 0;
        int right = charArray.length - 1;
        boolean isPalindrome = true;

        // Step 3: Compare characters from both ends
        while (left < right) {
            if (charArray[left] != charArray[right]) {
                isPalindrome = false;
                break; // Exit loop early if a mismatch is found
            }
            left++;  // Move forward
            right--; // Move backward
        }

        // Step 4: Display Result
        if (isPalindrome && cleanInput.length() > 0) {
            System.out.println("Result: \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a palindrome.");
        }

        scanner.close();
    }
}
