import java.util.Scanner;

public class ReversingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, rev = 0, rem;
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        while (num != 0) {
            rem = num % 10; // Get the last digit
            rev = rev * 10 + rem; // Add it to the reversed number
            num = num / 10; // Remove the last digit from the original number
        }
        System.out.println("Reversed Number: " + rev); // Print the reversed number 
        sc.close(); // Close the scanner to prevent resource leaks
    }
}
