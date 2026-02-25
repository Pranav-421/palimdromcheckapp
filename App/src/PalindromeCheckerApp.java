//version 2.0
//Author Gojo
//use case 4:
import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
         import java.util.Scanner;
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
