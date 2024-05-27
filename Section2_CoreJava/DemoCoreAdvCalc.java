package Section2_CoreJava;

// This class extends Calculator class and implements multiply and divide methods
// This class is used to demonstrate the concept of inheritance

public class DemoCoreAdvCalc extends Calculator{

    DemoCoreAdvCalc(int a, int b) {
        super(a, b);
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }
}
