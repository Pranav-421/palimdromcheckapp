//version 2.0
//Author Gojo
//use case 2:

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String original = "madam";
        String reversed = new StringBuilder(original).reverse().toString();
        if (original.equals(reversed)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}
