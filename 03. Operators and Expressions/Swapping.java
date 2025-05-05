public class Swapping {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // Swapping using a bitwise XOR operator
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a ^ b; // Step 1: a now holds the XOR of a and b
        b = a ^ b; // Step 2: b now holds the original value of a
        a = a ^ b; // Step 3: a now holds the original value of b
        // After swapping, a and b hold their original values swapped
        System.out.println("After swapping: a = " + a + ", b = " + b);
}
}
