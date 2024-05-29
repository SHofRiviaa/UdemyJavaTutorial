package Section2_CoreJava.tools;

public class DemoreCoreCalc {

        int a;
        int b;
        static int c;
    
        // Static block
        static {
    
            c = 100;
            System.out.println("Static block is executed");
        }
    
        public DemoreCoreCalc(int a, int b) {
            
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
    
        // Method overloading
        public int add(int a, int b, int c) {
            return a + b + c;
        }
    
        // Static method
        public static int add(int a, int b, int c, int d) {
            return a + b;
        }
    
}
