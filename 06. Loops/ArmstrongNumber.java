import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args)
    {
       Scanner scan=new Scanner(System.in);

       System.out.println("Enter a Number");
       int n=scan.nextInt();
       scan.close();
       
       int m=n;
       int sum=0;
       int r;
       while(n>0)
       {
        r=n%10;
        n=n/10;
        
        sum=sum+r*r*r;
       }
        if(sum==m)
            System.out.println("Its a Armstrong Number");
        else
            System.out.println("Its not an Armsttrong Number");
    }
}
