public class DeletingElement {
    public static void main(String[] args){
        int A[] = new int[10];
        A[0] = 1;
        A[1] = 2;
        A[2] = 3;
        A[3] = 4;
        A[4] = 5;
        A[5] = 6;

        int n = 6; // Number of valid elements in the array

        System.out.print("Before Deletion: ");
        for(int i = 0; i < n; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println();

        // Deleting an element at position 1 (second element)
        int pos = 1;
        for(int i = pos; i < n - 1; i++){
            A[i] = A[i + 1];
        }
        n--; // Reduce the count of elements after deletion

        System.out.print("After Deletion: ");
        for(int i = 0; i < n; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
}
