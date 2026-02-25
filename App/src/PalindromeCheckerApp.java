//version 2.0
//Author Pranav
//use case 9:
import java.util.Scanner;

public class UseCase9PalindromeCheckerApp {

    static boolean check(String s, int l, int r) {
        if (l >= r)
            return true;
        if (s.charAt(l) != s.charAt(r))
            return false;
        return check(s, l + 1, r - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        boolean b = check(s, 0, s.length() - 1);
        if (b)
            System.out.println("It is a palindrome");
        else
            System.out.println("It is not a palindrome");
        sc.close();
    }
}
