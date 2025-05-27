public class ReverseUsingOverloading {
    int reverse(int n)
    {
        int rev=0;
        
        while(n>0)
        {
            rev=rev*10+n%10;
            n=n/10;
        }
        return rev;
    }
    
    
    int [] reverse(int A[])
    {
        int B[]=new int[A.length];
        
        for(int i=A.length-1,j=0;i>=0;i--,j++)
            B[j]=A[i];
        
        return B;
    }

    public static void main(String[] args) {
        ReverseUsingOverloading obj = new ReverseUsingOverloading();
        
        // Test reversing an integer
        int number = 12345;
        int reversedNumber = obj.reverse(number);
        System.out.println("Reversed Number: " + reversedNumber);
        
        // Test reversing an array
        int[] array = {1, 2, 3, 4, 5};
        int[] reversedArray = obj.reverse(array);
        System.out.print("Reversed Array: ");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }
    }
}
