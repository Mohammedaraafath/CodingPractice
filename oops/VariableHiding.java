package oops;

class Parent {
    int x = 10;  // instance variable
    void show() { // method
        System.out.println("Parent show, x = " + x);
    }
}

class Child extends Parent {
    int x = 20;  // hides Parent's x
    void show() { // overrides Parent's show
        System.out.println("Child show, x = " + x);
    }
}

public class VariableHiding {
    public static void main(String[] args) {
        Parent p = new Child(); // reference type = Parent, object type = Child
        Child c = new Child();  // reference type = Child, object type = Child

        System.out.println(p.x); // 10 -> Parent's variable
        System.out.println(c.x); // 20 -> Child's variable

        p

                .show(); // "Child show, x = 20" -> method uses object type
        c.show(); // "Child show, x = 20" -> method uses object type
    }
}

