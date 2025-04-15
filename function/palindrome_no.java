import java.util.Scanner;

public class palindrome_no {
    public static boolean palindrome(int n) {
        int rev = 0;
        int num = n;
        while (n != 0) {
            int d = n % 10;
            rev = rev * 10 + d;
            n /= 10;
        }

        if (num == rev) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check Palindrome = ");
        int n = sc.nextInt();
        if (palindrome(n)) {
            System.out.println(n + " is an Palindrome Number.");
        } else {
            System.out.println(n + " is not Palindrome Number.");
        }
    }
}
