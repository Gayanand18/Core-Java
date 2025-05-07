import java.util.Scanner;

public class AreaTriangle1 {
    public static void main(String[] args) {
        // Area of triangle = 1/2 * base * height
        float base, height, area;
        System.out.println("Enter base and height of triangle: ");
        Scanner sc = new Scanner(System.in);
        base = sc.nextFloat();
        height = sc.nextFloat();

        
        area = (base * height) / 2;
        
        System.out.println("Area of triangle: " + area);
        sc.close();
    }
}
