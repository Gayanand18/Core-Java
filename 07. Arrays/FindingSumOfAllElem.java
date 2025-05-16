// Finding the sum of all elements in an array
public class FindingSumOfAllElem {
    public static void main(String[] args){
        int A[] = {1, 2, 3, 4, 5};
        int sum = 0;
        // Using for loop
        // for (int i = 0; i < A.length; i++){
        //     sum += A[i];
        // }


        // Using for-each loop
        for(int x : A){
            sum += x;
        }




        System.out.println("Sum of all elements in the array: " + sum);
    }
}