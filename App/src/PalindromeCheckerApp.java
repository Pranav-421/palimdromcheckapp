//version 2.0
//Author Pranav
//use case 10:
import java.util.Scanner;

public class UseCase9PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- UC9: Recursive Palindrome Checker ---");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        // Standardize input (remove spaces and convert to lowercase)
        String cleanInput = input.replaceAll("\\s+", "").toLowerCase();

        boolean result = isPalindrome(cleanInput, 0, cleanInput.length() - 1);

        if (result) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String str, int start, int end) {
        // Base Case 1: If start meets or passes end, we've checked everything
        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return isPalindrome(str, start + 1, end - 1);
    }
}
