public class NestedLoopPattern3 {
    public static void main(String[] args){
        int i, j;
        // Outer loop for rows
        // Inner loop for columns
        for(i = 1; i <= 5; i++)
        {
            for(j = 1; j <= 5; j++)
            {
                System.out.print((i + j) + " ");
                
            }
            System.out.println("");
            
        }
    // The above code prints the same number in each row, which is the value of i.
    }
}
