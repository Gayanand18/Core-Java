class Rectangle{
    public double length;
    public double breadth;

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }

    // public boolean isSquare() {
    //     if (length == breadth)
    //         return true;
    //     else 
    //         return false;
    // }
    public boolean isSquare() {
        return length == breadth;
    }
}

public class ClassForRectangle {
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        r1.length = 5;
        r1.breadth = 10;

        System.out.println("Area: " + r1.area());
        System.out.println("Perimeter: " + r1.perimeter());
        System.out.println("Is Square: " + r1.isSquare());

        Rectangle r2 = new Rectangle();
        r2.length = 4;
        r2.breadth = 4;

        System.out.println("Area: " + r2.area());
        System.out.println("Perimeter: " + r2.perimeter());
        System.out.println("Is Square: " + r2.isSquare());

    }
}
