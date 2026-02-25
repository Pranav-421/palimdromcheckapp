//version 2.0
//Author Pranav
//use case 7:
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class UseCase7PalindromeCheckerApp {

    public static boolean check(String s) {
        s = s.replaceAll("\\s+", "").toLowerCase();
        Deque<Character> d = new LinkedList<>();

        for (char c : s.toCharArray()) {
            d.addLast(c);
        }

        while (d.size() > 1) {
            char f = d.removeFirst();
            char l = d.removeLast();
            if (f != l) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();

        if (check(s)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}
