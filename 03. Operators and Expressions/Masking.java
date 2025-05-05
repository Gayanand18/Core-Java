public class Masking {
    public static void main(String[] args) {
        int a = 0b11001100; // 204 in decimal
        int b = 0b10101010; // 170 in decimal

        // Masking with AND
        int andResult = a & b;
        System.out.println("AND Result: " + Integer.toBinaryString(andResult)); // 10001000

        // Masking with OR
        int orResult = a | b;
        System.out.println("OR Result: " + Integer.toBinaryString(orResult)); // 11101110

        // Masking with XOR
        int xorResult = a ^ b;
        System.out.println("XOR Result: " + Integer.toBinaryString(xorResult)); // 01100110

        // Inversion
        int notA = ~a;
        System.out.println("NOT A: " + Integer.toBinaryString(notA)); // 00110011
    }
}
