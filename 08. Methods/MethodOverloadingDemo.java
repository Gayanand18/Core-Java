public class MethodOverloadingDemo {
    static public int max(int a,int b)
    {
        return a>b?a:b;
    }
    
    static public int max(int a,int b,int c)
    {
        if(a>b && a>c) return a;
        else if(b>c) return b;
        return c;
    }
    public static void main(String[] args) 
    {
        max(10,5);
        max(10,15,5);
        
        
        
    }
}
