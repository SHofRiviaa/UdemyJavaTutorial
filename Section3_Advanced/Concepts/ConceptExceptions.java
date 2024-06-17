package Section3_Advanced.Concepts;

import Section3_Advanced.Concepts.a.b.c;

class GeraltException extends Exception {
    public GeraltException(String message) {
        super(message);
    }
}

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

        int a = 20;
        int nums [] = {1, 2, 3, 4};
        int c=0;
        try {
            
            c = 18/a;
            if ( c== 0) {
                throw new ArithmeticException("Don't print 0!!!"); // throw keyword, used to throw an exception, it will be caught by the catch block
            
            }
            
            System.out.println("Value of c: " + c);
            System.out.println("Value of nums[5]: " + nums[5]);
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e);
        }
        catch (Exception e) {
            // catch all exceptions using the parent class Exception if the specific exception is not known
            // parent class should be the last catch block
            System.out.println("Exception: " + e);
        }
        finally {
            System.out.println("Finally block");
        }

        System.out.println("End of program");

        // top is object
        // then throwable, finishing with able are interfaces usually
        // then exception and error are classes
        //  from error, you have virtual machine error, out of memory error, stack overflow error, IO error, etc., can't be handled, unchecked
        //  from exception, you have runtime exception, sql exception, io exception, etc., can be handled
        //   from runtime exception, you have arithmetic exception, null pointer exception, array index out of bounds exception, etc., can be handled, checked
        //   from io exception, you have file not found exception, file not readable exception, file not writable exception, etc., can be handled
        //   from sql exception, you have sql syntax exception, sql data exception, sql transaction rollback exception, etc., can be handled

        // throw and throws
        // throw is used to throw an exception, throws is used to declare an exception
        // throw is used inside a method, throws is used in the method signature
        // throws is used to tell the caller that the method may throw an exception
        // throws is used to delegate the exception handling to the caller
        // throws is used to propagate the exception to the caller
        // ex: public void method() throws IOException, SQLException {}, which means that the method may throw IOException or SQLException
        // the error propagates to the caller, the caller should handle the exception ex: try { method(); } catch (IOException | SQLException e) {}
    }
}
