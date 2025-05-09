import java.util.Scanner;

public class GP_Series {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to find the GP series");
        System.out.print("Enter the first term (a): ");
        double a = sc.nextDouble();
        System.out.print("Enter the common ratio (r): ");
        double r = sc.nextDouble();
        System.out.print("Enter the number of terms (n): ");
        int n = sc.nextInt();
        System.out.println("The GP series is: ");
        for (int i = 0; i < n; i++) {
            double term = a * Math.pow(r, i);
            System.out.print(term + " ");
        }
        sc.close();
    }
}
