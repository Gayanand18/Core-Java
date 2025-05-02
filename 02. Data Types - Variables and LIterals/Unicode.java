public class Unicode {
    public static void main(String[] args) {
        // Unicode characters
        char x = 0x0931; // Unicode for 'ψ'
        System.out.println("Unicode character: " + x);

        // Unicode escape sequence
        String unicodeString = "\u0042\u0043\u0044"; // Unicode for 'B', 'C', 'D'
        System.out.println("Unicode string: " + unicodeString);
        // Unicode for devanagari 'क'
        String unicodeString2 = "\u0915"; // Unicode for 'क'
        System.out.println("Unicode string: " + unicodeString2);
    }
    
}
