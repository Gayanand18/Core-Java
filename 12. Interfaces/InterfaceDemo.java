interface Test2
{
    void meth1();
    void meth2();
    
}

class Test3 implements Test2
{
    @Override
    public void meth1()
    {
        System.out.println("Meth1 of Test3");
    }

    @Override
    public void meth2()
    {
        System.out.println("Meth2 of Test3");
    }
    public void meth3()
    {
        System.out.println("Meth3 of Test3");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Test2 t = new Test3();
        t.meth1();
        t.meth2();
    }
}