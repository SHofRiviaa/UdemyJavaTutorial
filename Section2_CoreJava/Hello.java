package Section2_CoreJava;

public class Hello {
    public static void main(String[] args) {
        
        // This is a single line comment
        /* This is a multi-line comment */

        // This is a print statement
        System.out.println("Hello, World!");

        // Variables
        // Data types: int, double, float, char, boolean, String
        // int: 32 bits, double: 64 bits, float: 32 bits, char: 16 bits, boolean: 1 bit
        // byte: 1 byte, short: 2 bytes, int: 4 bytes, long: 8 bytes, float: 4 bytes, double: 8 bytes, char: 2 bytes, boolean: 1 bit
        // 
        // String: sequence of characters
        // Variable declaration: data_type variable_name;
        // Variable initialization: variable_name = value;
        // Variable declaration and initialization: data_type variable_name = value;

        // This is a variable declaration and initialization statement 
        int a = 10;
        int b = 20;
        System.out.println("Sum of a and b is: " + (a + b));

        double c = 10.5;
        double d = 20.5;
        System.out.println("Sum of c and d is: " + (c + d));

        float e = 10.5f;
        float f = 20.5f;
        System.out.println("Sum of e and f is: " + (e + f));

        char g = 'A';
        char h = 'B';
        // ASCII value of A is 65 and B is 66
        System.out.println("Sum of g and h is: " + (g + h));
        System.out.println(g +" "+ h);

        boolean i = true;
        boolean j = false;
        System.out.println("Sum of i and j is: " + (i && j));

        String k = "Hello";
        String l = "World";
        System.out.println("Sum of k and l is: " + (k + " " + l));

        // Literals
        // Integer literals: 10, 20, 30
        // Floating point literals: 10.5, 20.5, 30.5
        // Character literals: 'A', 'B', 'C'
        // String literals: "Hello", "World", "Java"
        // Boolean literals: true, false
        
    }
}