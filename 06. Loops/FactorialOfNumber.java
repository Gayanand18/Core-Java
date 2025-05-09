import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args){
        int n, fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
        sc.close();
    }
}
