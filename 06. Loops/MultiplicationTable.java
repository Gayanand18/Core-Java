import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for Multiplication table: ");
        n = sc.nextInt();
        System.out.println("Multiplication table of " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
        sc.close();
    }
}
