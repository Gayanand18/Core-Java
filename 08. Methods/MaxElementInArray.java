public class MaxElementInArray {

    public static int maxElement(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        int A[] = {1, 2, 3, 40, 5, 6, 7, 8, 9, 10};
        int max = maxElement(A);
        System.out.println("Maximum element in the array is: " + max);

    }
}
