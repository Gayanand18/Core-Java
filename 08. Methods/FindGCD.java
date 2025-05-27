import java.util.Scanner;

public class FindGCD {
    // public static int gcd(int a, int b) {
    //     if (b == 0) {
    //         return a;
    //     }
    //     return gcd(b, a % b);
    // }

    
    // public static void main(String[] args) {
    //     java.util.Scanner sc = new java.util.Scanner(System.in);
    //     System.out.print("Enter first number: ");
    //     int a = sc.nextInt();
    //     System.out.print("Enter second number: ");
    //     int b = sc.nextInt();
    //     int result = gcd(a, b);
    //     System.out.println("GCD of " + a + " and " + b + " is: " + result);
    //     sc.close();
    // }



    public static int gcd(int a, int b) {
        while (a != b){
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int result = gcd(a, b);
        System.out.println("GCD of " + a + " and " + b + " is: " + result);
        sc.close();
    }
}
