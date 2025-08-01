package java8;

public class LambdaExpression {

    // What is a lambda expression?
    // ➤ A lambda expression is a short block of code which takes in parameters and returns a value (like a function).
    // ➤ It allows you to pass behavior (code) as data — very useful in functional programming.

    // Syntax for Lambda Expression:
    // ➤ (parameters) -> expression
    // ➤ OR
    // ➤ (parameters) -> { body with multiple statements }

    // Examples:
    // (x, y) -> x + y               // takes two params, returns sum
    // () -> System.out.println("Hi") // takes no params
    // s -> s.length()               // takes one param, returns length

    // Why was Lambda introduced?
    // ➤ Before Java 8, to pass code, we used anonymous classes:
    /*
        Runnable r = new Runnable() {
            public void run() {
                System.out.println("Hello");
            }
        };
    */

    // ➤ With lambdas, it becomes much simpler and cleaner:
    /*
        Runnable r = () -> System.out.println("Hello");
    */

    // Key Benefits of Lambdas:
    // ✓ Less boilerplate code
    // ✓ Improved readability
    // ✓ Enables functional programming (especially with Streams)

    public static void main(String[] args) {

        // Lambda with no parameters — prints message
        Runnable r = () -> System.out.println("Hello From Lambda");
        r.run();

        // Lambda with two parameters and return value
        // Functional Interface: Calculator
        Calculator add = (a, b) -> a + b;
        int result = add.operate(10, 20);
        System.out.println("Sum: " + result);
    }

    // Functional Interface for Calculator
    @FunctionalInterface
    interface Calculator {
        int operate(int x, int y);
    }
}
