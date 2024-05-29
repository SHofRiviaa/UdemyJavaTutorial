package Section2_CoreJava.tools;

// This class extends Calculator class and implements multiply and divide methods
// This class is used to demonstrate the concept of inheritance

public class DemoCoreAdvCalc extends DemoreCoreCalc{

    public DemoCoreAdvCalc(int a, int b) {
        super(a, b);
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    // Method overriding
    @Override
    public int add(int a, int b) {
        System.out.println("This is the add method of DemoCoreAdvCalc class");
        return a + b;
    }
}
