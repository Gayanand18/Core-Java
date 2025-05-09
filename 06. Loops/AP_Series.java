import java.util.Scanner;

public class AP_Series {
    public static void main(String[] args){
        // This program generates an Arithmetic Progression (AP) series based on user input.
        int a, d, n;
        // a = first term, d = common difference, n = number of terms
        Scanner sc = new Scanner(System.in);
        System.out.println("Arithmetic Progression (AP) Series");
        System.out.println("Enter the first term (a): ");
        a = sc.nextInt();
        System.out.println("Enter the common difference (d): ");
        d = sc.nextInt();
        System.out.println("Enter the number of terms (n): ");
        n = sc.nextInt();
        System.out.println("The AP series is: ");

        for(int i = 0; i < n; i++){
            // Calculate the ith term of the AP series
            int term = a + (i * d);
            System.out.print(term + " ");
        }
        sc.close();
        
    }
}
