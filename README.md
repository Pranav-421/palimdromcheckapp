import java.util.Scanner;

public class UseCase4PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();


        char[] charArray = cleanInput.toCharArray();

        int left = 0;
        int right = charArray.length - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (charArray[left] != charArray[right]) {
                isPalindrome = false;
                break; // Exit loop early if a mismatch is found
            }
            left++;  // Move forward
            right--; // Move backward
        }

        if (isPalindrome && cleanInput.length() > 0) {
            System.out.println("Result: \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a palindrome.");
        }

        scanner.close();
    }
}
