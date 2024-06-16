package Section3_Advanced.Concepts;

public class ConceptExceptions {


    public static void main(String[] args) {
        // Exceptions
        // Errors
        // Compile-time errors, compiler shows the error, syntax errors
        // Run-time errors, error shown at runtime, e.g. division by zero, file not found, should be handled so that the program does not crash
        // Logical errors, no error shown, but the output is not as expected, e.g. 2+2=5

        // Exception handling
        // try, catch, finally, throw, throws

        // try block, code that may throw an exception

        // catch block, code that handles the exception, can have multiple catch blocks, each for a different exception

        // finally block, code that always executes, whether an exception is thrown or not, used to close resources, e.g. file, database, network

        // throw keyword, used to throw an exception, can be used to throw a custom exception

        // throws keyword, used to declare an exception, used in the method signature, to tell the caller that the method may throw an exception

        // Exception class, root class

        // Checked exceptions, checked at compile time, e.g. IOException, SQLException, FileNotFoundException, ClassNotFoundException

        // Unchecked exceptions, not checked at compile time, e.g. ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException

        // Custom exceptions, user-defined exceptions, should extend Exception class, can have custom constructors

        // Exception handling, try with resources, used to automatically close resources, e.g. file, database, network

        // Exception handling, multi-catch block, used to catch multiple exceptions in a single catch block

        // Exception handling, rethrowing an exception, used to throw an exception to the caller, without handling it

        // Exception handling, chaining exceptions, used to chain exceptions, to keep the original exception information

        // Statements
        // normal statements, e.g. int a = 5;
        // critical statements, e.g. int b = 0; int c = a/b; // critical statement, may throw an exception

        int a = 1;
        int nums [] = {1, 2, 3, 4};

        try {
            int c = 18/a;
            System.out.println("Value of c: " + c);
            System.out.println("Value of nums[5]: " + nums[5]);
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e);
        } finally {
            System.out.println("Finally block");
        }

        System.out.println("End of program");


    }
}
