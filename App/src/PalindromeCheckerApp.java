//version 2.0
//Author Pranav
//use case 13:
    import java.util.*;

    public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- UC13: Palindrome Performance Comparison ---");
        System.out.print("Enter a long string to benchmark: ");
        String input = scanner.nextLine();

        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        System.out.println("\nBenchmarking Algorithms...");
        System.out.printf("%-25s | %-15s | %-10s\n", "Algorithm", "Time (nanos)", "Result");


        long startIterative = System.nanoTime();
        boolean resIterative = checkIterative(cleanInput);
        long endIterative = System.nanoTime();
        displayResult("Two-Pointer (Iterative)", endIterative - startIterative, resIterative);


        long startRecursive = System.nanoTime();
        boolean resRecursive = checkRecursive(cleanInput, 0, cleanInput.length() - 1);
        long endRecursive = System.nanoTime();
        displayResult("Recursive", endRecursive - startRecursive, resRecursive);

        long startStack = System.nanoTime();
        boolean resStack = checkStack(cleanInput);
        long endStack = System.nanoTime();
        displayResult("Stack-based", endStack - startStack, resStack);

        scanner.close();
    }

    private static boolean checkIterative(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) return false;
        }
        return true;
    }

    private static boolean checkRecursive(String str, int s, int e) {
        if (s >= e) return true;
        if (str.charAt(s) != str.charAt(e)) return false;
        return checkRecursive(str, s + 1, e - 1);
    }

    private static boolean checkStack(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) stack.push(c);
        for (char c : str.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }

    private static void displayResult(String name, long time, boolean result) {
        System.out.printf("%-25s | %-15d | %-10s\n", name, time, result);
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
