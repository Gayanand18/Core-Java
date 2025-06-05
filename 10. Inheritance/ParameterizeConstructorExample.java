class RectangleExample{
    public int length;
    public int breadth;

    RectangleExample(){
        length=breadth=1;
    }

    RectangleExample(int l, int b){
        length=l;
        breadth=b;
    }

    public int area(){
        return length * breadth;
    }

}

class CuboidExample extends RectangleExample{
    public int height;

    CuboidExample(){
        height=1;
    }

    CuboidExample(int l, int b, int h){
        super(l, b);
        height=h;
    }

    public int volume(){
        return area() * height;
    }
}

public class ParameterizeConstructorExample {
    public static void main(String[] args){

        CuboidExample c1 = new CuboidExample();
        System.out.println("Area of Cuboid: " + c1.area());
        System.out.println("Volume of Cuboid: " + c1.volume());
        CuboidExample c2 = new CuboidExample(5, 4, 3);
        System.out.println("Area of Cuboid: " + c2.area());
        System.out.println("Volume of Cuboid: " + c2.volume());

    }
}
