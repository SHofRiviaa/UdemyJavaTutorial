package Section3_Advanced.Concepts;

public class ConceptAbstract {
    
    // Abstract class
    // - A class that is declared abstract using the abstract keyword
    // - Can have abstract and non-abstract methods
    // - Cannot be instantiated
    // - Can have constructors and static methods
    // - Can have final methods which will force the subclass not to change the body of the method
    // - Can have final variables
    // - Can have static variables
    // - We can have an abstract class without any abstract method
    // - If a class has an abstract method, it must be declared abstract
    // - If a class is declared abstract, it cannot be instantiated
    // - Why use abstract classes?
    // - To provide a common interface for all the subclasses
    // example: Shape class with abstract method draw() and subclasses like Circle, Rectangle, Triangle  
    // Write an example of an abstract class
    abstract class AbstractClass {
        public abstract void abstractMethod();
    }

    public static void main(String[] args) {
        System.out.println("This is a concept class");

        Nissan obj = new Nissan();
        obj.start();
        obj.playMusic();
        obj.stop();
    }
}

abstract class Car { // Car is an abstract class, used to provide a common interface for all the subclasses
    public abstract void start();

    public abstract void fly();
    
    public void playMusic() {
        System.out.println("Playing music in car");
    }

    public void stop() {
        System.out.println("Car stopped");
    }
}

class Nissan extends Car { // Nissan is a subclass of Car, Nissan is concrete class
    // Needs to implement the abstract method start() from the abstract class Car
    // but doesn't need to implement the abstract method fly() from the abstract class Car
    // because it is not abstract, it is optional to implement it because Nissan inherits it from the abstract class Car
    // If we don't implement the abstract method, we will get a compilation error
    // If we don't want to implement the abstract method, we can declare the class as abstract

    public void start() {
        System.out.println("Nissan car started");
    }

    public void fly() {
        System.out.println("Nissan car flying");
    }
    
}
