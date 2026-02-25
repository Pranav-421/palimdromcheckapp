//version 2.0
//Author Gojo
//use case 3:

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        import java.util.Scanner;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check: ");
        String original = scanner.nextLine();
        
        String cleanOriginal = original.replaceAll("\\s+", "").toLowerCase();
        String reversed = "";
        
        for (int i = cleanOriginal.length() - 1; i >= 0; i--) {
            reversed += cleanOriginal.charAt(i); // String concatenation
        }

        System.out.println("Original String: " + cleanOriginal);
        System.out.println("Reversed String: " + reversed);
        
        if (cleanOriginal.equals(reversed)) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }

        scanner.close();
    }
}
    }
}
3
