package oops;

// Case 1: No constructor defined → Java provides default constructor
class A {
    int x;
    String msg;
    // Compiler automatically provides:
    // A() { }
}

class B {
    int id;
    String name;

    // Case 2: Explicit parameterized constructor
    B(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // If we need default constructor also, we must add it ourselves
    B() {
        this.id = 0;
        this.name = "Unknown";
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {

        // Case 1: Using compiler-provided default constructor
        A a1 = new A();
        System.out.println("A object created: x = " + a1.x + ", msg = " + a1.msg);
        // (x = 0, msg = null because Java assigns default values)

        // Case 2: Using explicit constructors in B
        B b1 = new B(101, "Araafath"); // parameterized constructor
        System.out.println("B object created: id = " + b1.id + ", name = " + b1.name);

        B b2 = new B(); // manually defined no-arg constructor
        System.out.println("B object created: id = " + b2.id + ", name = " + b2.name);
    }
}
