package Section3_Advanced.Concepts;

// class - class -> extends
// class - interface -> implements
// interface - interface -> extends

// Interface
// - A reference type in Java
// - What is the use of an interface?
// - It is used to achieve abstraction
// - It is used to achieve multiple inheritance
// - It is used to achieve loose coupling
// - It is used to achieve contract-driven development
// - It is used to achieve polymorphism
// - It is used to achieve dependency injection
// - It is used to achieve unit testing
// - It is used to achieve mocking
// - It is used to achieve decoupling
// - Similar to a class, it is a collection of abstract methods
// - A class implements an interface, thereby inheriting the abstract methods of the interface
// - Along with abstract methods, an interface may also contain constants, default methods, static methods, and nested types
// - Method bodies exist only for default methods and static methods
// - Interfaces cannot be instantiated
// - An interface can extend multiple interfaces
// - An interface cannot implement a class

// Types of Interfaces
// - Normal Interface
// - Single Abstract Method (SAM) Interface/Functional Interface
// - Marker Interface

// Normal Interface
// - An interface that has more than one abstract method
// - It is used to achieve multiple inheritance
// - It is used to achieve abstraction
// - It is used to achieve loose coupling
// - It is used to achieve contract-driven development
// - It is used to achieve polymorphism

// Single Abstract Method (SAM) Interface/Functional Interface
// - An interface that has only one abstract method
// - It is used to achieve multiple inheritance
// Like for example, Runnable, Callable, ActionListener, etc.

// Marker Interface
// - An interface that has no abstract methods
// - It is used to provide metadata to the JVM
// Like for example, Serializable, Cloneable, Remote, etc.



interface K{

    int age=44; // by default, all the variables in an interface are static, and final

    // by default, all the methods in an interface are public and abstract
    void display(); // abstract method, can access only static variables, meaning you don't need to create an object of the class to access this method
    void show();
}

interface C{
    void display2();
}

interface D extends K
{
    void display3();
}

class B implements C, D
{
    public void display(){
        System.out.println("Display method");
    }
    public void show(){
        System.out.println("Show method");
    }
    @Override
    public void display2() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'display2'");
    }
    @Override
    public void display3() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'display3'");
    }
}

class Developer
{
    public void devApp(Computer pc)
    {
        pc.code();
    }
}

class Laptop implements Computer
{
    public void code()
    {
        System.out.println("code, compile, run, debug, test, deploy, maintain, and document software applications and systems.");
    }
}

class Desktop implements Computer
{
    public void code()
    {
        System.out.println("code, compile, run, debug, test, deploy, maintain, and document software applications and systems. Fast and powerful.");
    }
}

//abstract class Computer // instead of abstract class, we can use interface
//{
//    public abstract void code();
    //{ //but this method is empty, so better to make it abstract
    //}
//}

interface Computer
{
    void code();
}

// ====================================================================================================

@FunctionalInterface // annotation, helps to check if the interface is a functional interface so that it can have only one abstract method
interface AT
{
    void show();
}

public class ConceptInterface {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
        obj.show();

        System.out.println(K.age);

        // A obj = new A(); // error: A is abstract; cannot be instantiated
        Computer alienware = new Laptop();
        Computer dell = new Desktop();
        Developer dev = new Developer();
        dev.devApp(dell);

        AT obj2 = new AT() {
            public void show() {
                System.out.println("In show AT");
            }
        };

        obj2.show();
        
    }
}
