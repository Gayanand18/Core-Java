class Rectangle
{
    int length;
    int breadth;
    int x=10;
    
    Rectangle(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
   
}

class Cuboid extends Rectangle
{
    int height;
    int x=20;
    
    Cuboid(int l,int b,int h)
    {
        super(l,b);
        height=h;
    }
    
    void display()
    {
        // Prints the value of x from the Rectangle (super) class
        System.out.println(super.x);
        // Prints the value of x from the Cuboid (this) class
        System.out.println(x);
    }
}

public class ThisVsSuperDemo {
    public static void main(String[] args) 
    {
    
           Cuboid c=new Cuboid(10,5,15);
           c.display();
        
    }   
}
