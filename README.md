    import java.util.*;
    
    interface PalindromeStrategy {
    boolean isPalindrome(String input);
    }

    class StackStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String input) {
        String clean = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (char c : clean.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return clean.equals(reversed.toString());
    }
    }

    
    class DequeStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String input) {
        String clean = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Deque<Character> deque = new LinkedList<>();

        for (char c : clean.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
    }

    class PalindromeContext {
    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean executeStrategy(String input) {
        return strategy.isPalindrome(input);
    }
    }

    public class UseCase12PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PalindromeContext context = new PalindromeContext();

        System.out.println("--- UC12: Strategy Pattern Palindrome Checker ---");
        System.out.print("Enter string: ");
        String input = scanner.nextLine();

        System.out.println("Choose Strategy: 1. Stack  2. Deque");
        int choice = scanner.nextInt();

        if (choice == 1) {
            context.setStrategy(new StackStrategy());
            System.out.println("Using Stack Strategy...");
        } else {
            context.setStrategy(new DequeStrategy());
            System.out.println("Using Deque Strategy...");
        }

        boolean result = context.executeStrategy(input);
        System.out.println("Result: Is Palindrome? " + result);

        scanner.close();
    }
    }
