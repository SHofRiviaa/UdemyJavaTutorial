package Section2_CoreJava;

class Calculator {

    int a;
    int b;

    Calculator(int a, int b) {
        System.out.println("Calculator object is created");
        this.a = a;
        this.b = b;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    // Method overloading
    public int add(int a, int b, int c) {
        return a + b + c;
    }

}

class Mobile {

    String brand;
    String model;
    int price;
    static String type;

    Mobile(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String toString() {
        return "Brand: " + brand + " Model: " + model + " Price: " + price;
    }

}

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

        // Switch statement with string
        String day = "Wednesday";
        switch (day) {
            case "Monday":
                System.out.println("Today is Monday");
                break;
            case "Tuesday":
                System.out.println("Today is Tuesday");
                break;
            case "Wednesday":
                System.out.println("Today is Wednesday");
                break;
            case "Thursday":
                System.out.println("Today is Thursday");
                break;
            case "Friday":
                System.out.println("Today is Friday");
                break;
            case "Saturday":
                System.out.println("Today is Saturday");
                break;
            case "Sunday":
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
        
        // Loops
        // for, while, do-while
        for (int i3 = 0; i3 < 5; i3++) {
            System.out.println("Value of i3 is: " + i3);
        }

        int i4 = 0;
        while (i4 < 5) {
            System.out.println("Value of i4 is: " + i4);
            i4++;
        }

        int i5 = 0;

        do {
            System.out.println("Value of i5 is: " + i5);
            i5++;
        } while (i5 < 5);

        int a3 = 3;
        int b3 = 6;
        int result3 = (~a3 & b3) | (a3 & ~b3);
        System.out.println("Quiz q"+ result3);

        int x2 = 5;
        int y2 = 10;
        int z2 = (x2++ > 5 && y2-- < 10) ? x2-- : y2;

        System.out.println("Quiz q"+ z2 + " " + x2 + " " + y2);

        // OOPs concepts
        // Class, Object, Inheritance, Polymorphism, Abstraction, Encapsulation
        // Class: blueprint of an object
        // Object: instance of a class

        // Object - properties and behavior
        // Inheritance: mechanism in which one class acquires the properties and behavior of another class
        // Polymorphism: ability to present the same interface for different data types
        // Abstraction: hiding the implementation details and showing only the functionality
        // Encapsulation: wrapping up of data and methods into a single unit

        Calculator calc = new Calculator(10, 20);
        System.out.println("Sum of 10 and 20 with calculator is: " + calc.add(10, 20));
        System.out.println("Difference of 10 and 20 with calculator is: " + calc.subtract(10, 20));
        System.out.println("Product of 10 and 20 with calculator is: " + calc.multiply(10, 20));
        System.out.println("Division of 10 and 20 with calculator is: " + calc.divide(10, 20));

        
        // Method overloading: same method name with different parameters
        // Method signature: method name + parameters
        System.out.println("Sum of 10, 20 and 30 with calculator is: " + calc.add(10, 20, 30));

        // JVM: Java Virtual Machine
        // JVM is responsible for converting byte code into machine code
        // JRE: Java Runtime Environment
        // JRE is a set of tools used to run Java applications

        // JDK: Java Development Kit
        // JDK is a set of tools used to develop Java applications

        // Stack memory: method calls and local variables 
        // Heap memory: objects and instance variables

        // Array: collection of similar data types
        // Array declaration: data_type[] array_name;
        // Array initialization: array_name = new data_type[size];
        // Array declaration and initialization: data_type[] array_name = new data_type[size];
        System.out.println("*****************************************");
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        for (int i6 = 0; i6 < arr.length; i6++) {
            System.out.println("Value of arr at index " + i6 + " is: " + arr[i6]);
        }

        int[] arr1 = {10, 20, 30, 40, 50};
        for (int i7 = 0; i7 < arr1.length; i7++) {
            System.out.println("Value of arr1 at index " + i7 + " is: " + arr1[i7]);
        }

        System.out.println("*****************************************");
        // Enhanced for loop

        for (int val : arr1) {
            System.out.println("In enhanced for loop, Value of val is: " + val);
        }

        System.out.println("*****************************************");
        // Multi-dimensional array
        int[][] arr2 = new int[2][2];
        arr2[0][0] = 10;
        arr2[0][1] = 20;
        arr2[1][0] = 30;
        arr2[1][1] = 40;

        for (int i8 = 0; i8 < arr2.length; i8++) {
            for (int j1 = 0; j1 < arr2[i8].length; j1++) {
                System.out.println("Value of arr2 at index " + i8 + " " + j1 + " is: " + arr2[i8][j1]);
            }
        }

        int[][] arr3 = {{10, 20}, {30, 40}};
        for (int i9 = 0; i9 < arr3.length; i9++) {
            for (int j2 = 0; j2 < arr3[i9].length; j2++) {
                System.out.println("Value of arr3 at index " + i9 + " " + j2 + " is: " + arr3[i9][j2]);
            }
        }

        System.out.println("*****************************************");
        // Jaggered array

        int[][] arr4 = new int[3][];
        arr4[0] = new int[2];
        arr4[1] = new int[3];
        arr4[2] = new int[4];

        arr4[0][0] = 10;
        arr4[0][1] = 20;
        arr4[1][0] = 30;
        arr4[1][1] = 40;
        arr4[1][2] = 50;
        arr4[2][0] = 60;
        arr4[2][1] = 70;
        arr4[2][2] = 80;
        arr4[2][3] = 90;

        for (int i10 = 0; i10 < arr4.length; i10++) {
            for (int j3 = 0; j3 < arr4[i10].length; j3++) {
                System.out.println("Value of arr4 at index " + i10 + " " + j3 + " is: " + arr4[i10][j3]);
            }
        }
        
        System.out.println("*****************************************");
        // Array of objects
        Calculator[] calcs = new Calculator[2];
        calcs[0] = new Calculator(10, 20);

        System.out.println("Sum of 10 and 20 with calculator is: " + calcs[0].add(10, 20));
        System.out.println(calcs[0]);

        // for each loop
        for (Calculator calc1 : calcs) {
            System.out.println(calc1);
        }

        System.out.println("*****************************************");
        // String class
        // String is a sequence of characters
        // String is immutable
        // String class is present in java.lang package
        // String class has many methods like length(), charAt(), indexOf(), substring(), trim()
        // toLowerCase(), toUpperCase(), equals(), equalsIgnoreCase(), contains(), startsWith(), endsWith(), replace(), split(), concat(), valueOf(), format(), intern()
        // String class is final, so it cannot be inherited
        // String class is thread safe
        // String class is serializable
        // String class is comparable
        // String class is used in many classes like StringBuffer, StringBuilder, StringTokenizer, Scanner, Pattern, Matcher, URL, URI, InetAddress, Date, Calendar, Locale, Pattern, Matcher, Scanner, Formatter

        String str = "Hello, World!";
        System.out.println("Length of str is: " + str.length());
        System.out.println("Character at index 0 of str is: " + str.charAt(0));
        System.out.println("Index of l in str is: " + str.indexOf('l'));
        System.out.println("Substring of str is: " + str.substring(0, 5));
        System.out.println("Trim of str is: " + str.trim());
        System.out.println("Lower case of str is: " + str.toLowerCase());
        System.out.println("Upper case of str is: " + str.toUpperCase());
        System.out.println("Is str equal to Hello, World!: " + str.equals("Hello, World!"));
        System.out.println("Is str equal to hello, world!: " + str.equalsIgnoreCase("hello, world!"));
        System.out.println("Does str contain Hello: " + str.contains("Hello"));
        System.out.println("Does str start with Hello: " + str.startsWith("Hello"));
        System.out.println("Does str end with World!: " + str.endsWith("World!"));
        System.out.println("Replace of str is: " + str.replace("Hello", "Hi"));
        System.out.println("Split of str is: " + str.split(",")[0]);
        System.out.println("Concat of str is: " + str.concat(" Java"));
        System.out.println("Value of 10 in str is: " + String.valueOf(10));
        // String constant pool
        // String pool is a memory area in heap memory
        // String pool is used to store string literals
        // String pool is used to store unique strings
        // String pool is used to save memory
        // String pool is used to increase performance
        // String pool is used to reduce garbage collection
        // String pool is used to reduce memory leaks
        // String pool is used to reduce memory fragmentation
        // String pool is used to reduce memory allocation
        // ex: String str1 = "Hello"; String str2 = "Hello"; str1 and str2 will point to the same memory location
        // ex: String str1 = new String("Hello"); String str2 = new String("Hello"); str1 and str2 will point to different memory locations
        
        // Mutable string: StringBuffer, StringBuilder
        // StringBuffer: thread safe, synchronized, slow
        // StringBuilder: not thread safe, not synchronized, fast
        System.out.println("*****************************************");
        StringBuffer sb = new StringBuffer("Hello, World!");
        System.out.println("Length of sb is: " + sb.length());
        System.out.println("Capacity of sb is: " + sb.capacity());
        System.out.println("Append of sb is: " + sb.append(" Java"));
        System.out.println("Insert of sb is: " + sb.insert(0, "Hi, "));
        System.out.println("Delete of sb is: " + sb.delete(0, 4));
        System.out.println("Reverse of sb is: " + sb.reverse());
        System.out.println("Replace of sb is: " + sb.replace(0, 5, "Hello"));
        System.out.println("Substring of sb is: " + sb.substring(0, 5));
        System.out.println("CharAt of sb is: " + sb.charAt(0));

        
        System.out.println("*****************************************");

        // Static keyword
        // Static variable: class level variable, common for all objects
        // Static method: class level method, common for all objects
        // Static block: used to initialize static variables
        // Static means that the variable or method belongs to the class and not to the object
        
        Mobile.type = "Smartphone";
        Mobile mobile1 = new Mobile("Apple", "iPhone 12", 1000);
        Mobile mobile2 = new Mobile("Samsung", "Galaxy S21", 900);
        System.out.println(mobile1);
        System.out.println(mobile2);
        System.out.println("Type of mobile is: " + Mobile.type);

        

    }
}