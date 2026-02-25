import java.util.Scanner;
import java.util.Stack;

public class UseCase5PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter string: ");
        String input = sc.nextLine();
        String clean = input.toLowerCase();
        
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < clean.length(); i++) {
            stack.push(clean.charAt(i));
        }
        
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }
        
        if (clean.equals(reversed)) {
            System.out.println("Result: Palindrome");
        } else {
            System.out.println("Result: Not a palindrome");
        }
        
        sc.close();
    }
}
