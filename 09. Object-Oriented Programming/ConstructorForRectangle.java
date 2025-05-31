class Rectangle2
{
    public double length;
    public double breadth;

    // Default constructor
    public Rectangle2()
    {
        length = 1;
        breadth = 1;
    }

    // Parameterized constructor
    public Rectangle2(double l, double b)
    {
        setLength(l);
        setBreadth(b);
    }

    // Constructor with one parameter
    public Rectangle2(double side)
    {
        length = breadth = side;
    }

    // getter and setter methods for length and breadth
    public double getLength() {
        return length;
    }

    public void setLength(double l) {
        length = l;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double b) {
        breadth = b;
    }
    
    public double area()
    {
        return length*breadth;
    }
    
    public double perimeter()
    {
        return 2*(length+breadth);
    }
    
    public boolean isSquare()
    {
        if(length==breadth)
            return true;
        else
            return false;
    }
    
}

public class ConstructorForRectangle {

    public static void main(String[] args) {
        Rectangle2 r=new Rectangle2(10);
        
        System.out.println("Area: "+r.area());
        System.out.println("perimeter: "+r.perimeter());
        
        System.out.println("Is it a Square: "+r.isSquare());
    }
    
}
