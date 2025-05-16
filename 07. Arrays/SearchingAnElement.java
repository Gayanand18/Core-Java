import java.util.Scanner;

public class SearchingAnElement {
    public static void main(String[] args){
         int A[]={3,9,7,8,12,6,15,5,4,10};
         Scanner sc = new Scanner(System.in);
            int key = 11;
            System.out.println("Eneter a Key " );
            key=sc.nextInt();
        
        
            for(int i=0;i<A.length;i++)
            {
                if(key==A[i])
                {
                    System.out.println("Element Found at :"+i);
                    System.exit(0);
                }
            }
            System.out.println("Not found");
            sc.close();
        }
    }
