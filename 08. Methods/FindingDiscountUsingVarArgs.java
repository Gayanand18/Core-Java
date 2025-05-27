public class FindingDiscountUsingVarArgs {
     static double sum(double ...P)
    {
        double sum=0;
        
        for(int i=0;i<P.length;i++)
            sum+=P[i];
        
        if(sum<500) return sum*0.10;
        else if(sum>=500 && sum<1000) return sum*0.15;
        else return sum*0.20;
        
    }

    public static void main(String[] args) {
        System.out.println("Discount on purchase: " + sum(100, 200, 300, 400, 500));
        System.out.println("Discount on purchase: " + sum(600, 700, 800));
        System.out.println("Discount on purchase: " + sum(1200, 1300));
    }
}
