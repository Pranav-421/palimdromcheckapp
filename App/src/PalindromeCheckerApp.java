//version 2.0
//Author Pranav
//use case 11:
import java.util.Scanner;

class PalindromeService {
    public boolean checkPalindrome(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }

        String clean = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = clean.length() - 1;

        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

public class UseCase11PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PalindromeService service = new PalindromeService();

        System.out.println("--- UC11: Object-Oriented Palindrome Service ---");
        System.out.print("Enter string: ");
        String input = scanner.nextLine();

        if (service.checkPalindrome(input)) {
            System.out.println("Result: The input is a palindrome.");
        } else {
            System.out.println("Result: The input is NOT a palindrome.");
        }

        scanner.close();
    }
}
