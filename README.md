import java.util.Scanner;

public class UseCase8PalindromeCheckerApp {

    static class Node {
        char d;
        Node n;

        Node(char d) {
            this.d = d;
            this.n = null;
        }
    }

    public static boolean check(String s) {
        s = s.replaceAll("\\s+", "").toLowerCase();

        if (s.length() == 0) return true;

        Node h = new Node(s.charAt(0));
        Node t = h;

        for (int i = 1; i < s.length(); i++) {
            t.n = new Node(s.charAt(i));
            t = t.n;
        }

        Node slow = h;
        Node fast = h;

        while (fast != null && fast.n != null) {
            slow = slow.n;
            fast = fast.n.n;
        }

        Node prev = null;
        Node curr = slow;
        Node next = null;

        while (curr != null) {
            next = curr.n;
            curr.n = prev;
            prev = curr;
            curr = next;
        }

        Node p1 = h;
        Node p2 = prev;

        while (p2 != null) {
            if (p1.d != p2.d) {
                return false;
            }
            p1 = p1.n;
            p2 = p2.n;
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
