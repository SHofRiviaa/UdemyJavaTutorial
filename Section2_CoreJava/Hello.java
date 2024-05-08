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
        
        // Type conversion and casting
        // Implicit type conversion: byte -> short -> int -> long -> float -> double
        // Explicit type conversion: double -> float -> long -> int -> short -> byte
        // Casting: (data_type) variable_name
        int a1 =257;
        byte k1 = (byte)a1;
        System.out.println(k1);

        float f1 = 10.5f;
        int i1 = (int)f1;
        System.out.println(i1);

        // Type promotion
        // byte -> short -> int -> long -> float -> double
        // byte + int -> int
        byte b1 = 10;
        int i2 = 20;
        int sum = b1 + i2;
        System.out.println(sum);
        
        // Operators
        // Arithmetic operators: +, -, *, /, %
        int num1 = 10;
        int num2 = 20;
        System.out.println("Sum of num1 and num2 is: " + (num1 + num2));
        System.out.println("Difference of num1 and num2 is: " + (num1 - num2));
        System.out.println("Product of num1 and num2 is: " + (num1 * num2));
        System.out.println("Division of num1 and num2 is: " + (num1 / num2));

        num1 = num1 + 1;
        num1 += 1;
        // post increment
        num1++; //fetch the value and then increment
        // pre increment
        ++num1; //increment the value and then fetch
        System.out.println("Increment of num1 is: " + num1);

        // Relational operators: >, <, >=, <=, ==, !=
        System.out.println("Is num1 greater than num2: " + (num1 > num2));
        System.out.println("Is num1 less than num2: " + (num1 < num2));
        System.out.println("Is num1 greater than or equal to num2: " + (num1 >= num2));
        System.out.println("Is num1 less than or equal to num2: " + (num1 <= num2));
        System.out.println("Is num1 equal to num2: " + (num1 == num2));
        System.out.println("Is num1 not equal to num2: " + (num1 != num2));

        // Logical operators: &&, ||, !
        System.out.println("Logical AND of num1 and num2: " + (num1 > num2 && num1 < num2));
        System.out.println("Logical OR of num1 and num2: " + (num1 > num2 || num1 < num2));
        System.out.println("Logical NOT of num1: " + !(num1 > num2));

        // Short circuit operators
        // &&: if the first condition is false, then the second condition is not checked
        // ||: if the first condition is true, then the second condition is not checked
        int x = 10;
        int y = 20;
        if (x > 10 && y > 10) {
            System.out.println("Both x and y are greater than 10");
        } else {
            System.out.println("Either x or y is not greater than 10");
        }

        // Conditional statements
        // if, if-else, if-else-if, switch-case
        if (x > 10) {
            System.out.println("x is greater than 10");
        } else {
            System.out.println("x is not greater than 10");
        }

        if (x > 10) {
            System.out.println("x is greater than 10");
        } else if (x < 10) {
            System.out.println("x is less than 10");
        } else {
            System.out.println("x is equal to 10");
        }

        switch (x) {
            case 10:
                System.out.println("x is equal to 10");
                break;
            case 20:
                System.out.println("x is equal to 20");
                break;
            default:
                System.out.println("x is not equal to 10 or 20");
        }

        // Terenary operator
        // variable = (condition) ? expression1 : expression2;
        int result = (x > 10) ? 1 : 0;
        System.out.println("Result is: " + result);

    }
}