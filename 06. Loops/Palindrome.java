import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, r, rev = 0;
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        int num = n; // Store the original number for comparison
        while (n != 0) {
            r = n % 10; // Get the last digit
            rev = rev * 10 + r; // Build the reversed number
            n = n / 10; // Remove the last digit from n
            
        }
        if (num == rev) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
        sc.close();
    }
}
