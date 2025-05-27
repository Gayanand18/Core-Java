public class CalculateAreaOverloading {
     static double area(double radius)
    {
        return Math.PI*radius*radius;
    }
    
    static double area(double length,double breadth)
    {
        return length*breadth;
    }

    public static void main(String[] args) {
        double circleArea = area(5.0); // Area of circle with radius 5.0
        double rectangleArea = area(4.0, 6.0); // Area of rectangle with length 4.0 and breadth 6.0
        
        System.out.println("Area of Circle: " + circleArea);
        System.out.println("Area of Rectangle: " + rectangleArea);
    }
}
