package Section2_CoreJava;

public class DemoreCoreVeryAdvCalc extends DemoCoreAdvCalc{
    
    DemoreCoreVeryAdvCalc(int a, int b) {
        super(a, b);
    }
    
    public int power(int a, int b) {
        return (int) Math.pow(a, b);
    }
}
