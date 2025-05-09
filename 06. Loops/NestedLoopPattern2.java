public class NestedLoopPattern2 {
    public static void main(String[] args){
        int i, j;
        // Outer loop for rows
        // Inner loop for columns
        for(i = 1; i <= 5; i++)
        {
            for(j = 1; j <= 5; j++)
            {
                System.out.print(i + " ");
                
            }
            System.out.println("");
            
        }
    }
}
