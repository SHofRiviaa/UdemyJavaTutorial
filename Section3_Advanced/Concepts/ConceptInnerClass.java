package Section3_Advanced.Concepts;

class a
{
    int a = 10;

    public void display() // non-static method, can access non-static variables, meaning you need to create an object of the class to access this method
    {
        System.out.println("a = " + a);
    }

    // Inner class
    // - A class inside another class
    // - Can access all the variables of the outer class
    // - Can be static or non-static
    // - Can be private, protected, public, or default
    // - Can be abstract or final
    // We can create an object of the inner class inside the outer class
    // Why use inner classes?
    // - Code optimization: It can lead to more readable and maintainable code
    // - Logical grouping of classes: If a class is useful to only one other class, then it is logical to have it as an inner class
    // - Encapsulation: It can lead to more readable and maintainable code
    // - Better code organization: It can lead to more readable and maintainable code
    // - Accessing the private members of the outer class
    // - Callbacks: It can be used to implement callbacks
    // - Event handling: It can be used to implement event handling
    // - Anonymous inner classes: It can be used to implement anonymous inner classes
    class b
    {
        int b = 20;

        public void config()
        {
            System.out.println("This is a non-static inner class in class b");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }

        class c
        {
            int c = 30;
            public void display()
            {
                System.out.println("This is a non-static inner class in class c");
                System.out.println("a = " + a);
                System.out.println("b = " + b);
                System.out.println("c = " + c);
            }
        }
    }

     static class d // static inner class, can access only static variables, meaning you don't need to create an object of the class to access this method
    {
        static int d = 40;

        public static void config()
        {
            System.out.println("d = " + d);
            System.out.println("This is a static method in a static inner class");
        }
    }
}

// Example of a anonymous inner class
class E
{
    public void display()
    {
        System.out.println("This is a non-static method in class E");
    }
}


// Example of abstract inner class
abstract class F
{
    public abstract void display();
}

class G extends F // but this a new class for only one method, so we can use anonymous inner class
{
    public void display()
    {
        System.out.println("This is a non-static method in class G");
    }
}

abstract class H
{
    // Abstract methods only in class H, it's okay but we can use interface instead
    public abstract void display();
    public abstract void show();
}

public class ConceptInnerClass {
    
    public static void main(String[] args) {
        System.out.println("This is a concept class");

        a obj = new a();
        obj.display();

        // Creating an object of inner class b, which is a non-static inner class
        // We need to create an object of the outer class to create an object of the inner class
        a.b obj1 = obj.new b();
        obj1.config();

        a.b.c obj2 = obj1.new c();
        obj2.display();

        // Creating an object of static inner class d
        // We don't need to create an object of the outer class to create an object of the static inner class
        a.d.config(); // Accessing the static method config() in a static way

        // Anonymous inner class
        // - A class without a name
        // - It is used to override the method of a class or an interface
        // - It is defined and instantiated in a single statement
        // ex:
        E obj3 = new E()
        {
            public void display()
            {
                System.out.println("This is an anonymous inner class");
            }
        };

        obj3.display();

        // Abstract anonymous inner class
        // - An inner class that is declared abstract
        // - It can have abstract and non-abstract methods
        // - It cannot be instantiated
        // - It can be used to provide a common interface for all the subclasses
        F obj4 = new F()
        {
            public void display()
            {
                System.out.println("This is an abstract inner class for abstract method display()");
            }
        };

        obj4.display();
    }
}
