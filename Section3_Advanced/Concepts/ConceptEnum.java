package Section3_Advanced.Concepts;

// Enum
// - A special "class" that represents a group of constants (unchangeable variables, like final variables)
// - To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma
// - Enum constants are implicitly static and final and can be accessed like static members
// - Why and when should you use enums?
// - When you have a fixed set of constants
// - When you need to define constants that represent an integer value

// can't extend enum class

enum Level {
    LOW,
    MEDIUM,
    HIGH
}

enum Laptop {
    DELL(1000),
    HP,
    LENOVO(1500);

    private int price;


    Laptop() {
        this.price = 1200;
    }
    Laptop(int price) {
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return "Price of " + name() + " is " + price;
    }
}

public class ConceptEnum {
    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
        System.out.println(myVar);
        System.out.println(myVar.ordinal());

        Level[] arr = Level.values();
        for (Level val : arr) {
            System.out.println(val);
            System.out.println(val.ordinal());
        }

        if(myVar == Level.MEDIUM) {
            System.out.println("Medium level");
        }
        else if(myVar == Level.LOW) {
            System.out.println("Low level");
        }
        else {
            System.out.println("High level");
        }

        switch(myVar) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }

        Laptop myLaptop = Laptop.DELL;
        System.out.println(myLaptop);

        for (Laptop val : Laptop.values()) {
            System.out.println(val);
        }
    }
}
