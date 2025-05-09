import java.util.Scanner;

public class DisplayDigitOfNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, r; // Declare variables n and r
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        System.out.println("Digits of " + n + " are: ");
        while (n > 0) {
            r = n % 10; // Get the last digit
            n = n / 10; // Remove the last digit from n
            System.out.println(r); // Print the last digit
        }
        sc.close(); // Close the scanner
        System.out.println(n); // Print the final value of n (which will be 0)
    }
}
