package java8;
import java.util.function.*;

public class FunctionalInterfaceExample {

    // What is a Functional Interface?
    // ➤ An interface with exactly one abstract method (can have default/static methods too)

    // Why use Functional Interfaces?
    // ➤ Allows us to use Lambda Expressions for short, clean implementations.

    /*
        Built-in Functional Interfaces in Java 8
        | Interface           | Abstract Method     | Usage Example                                  |
        | ------------------- | ------------------- | ---------------------------------------------- |
        | Predicate<T>        | boolean test(T t)   | Check a condition, returns true/false         |
        | Function<T,R>       | R apply(T t)        | Convert one type to another                   |
        | Supplier<T>         | T get()             | No input, returns a value                     |
        | Consumer<T>         | void accept(T t)    | Takes input, returns nothing (action)         |
        | BiFunction<T,U,R>   | R apply(T t, U u)   | Takes two inputs, returns value               |
        | UnaryOperator<T>    | T apply(T t)        | Same type input/output (extends Function)     |
        | BinaryOperator<T>   | T apply(T t, T u)   | Same type input/output (extends BiFunction)   |
    */

    public static void main(String[] args) {

        // Predicate Example – checks if a number is even
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("Is 20 even? " + isEven.test(20));
        System.out.println("Is 3 even? " + isEven.test(3));

        System.out.println("-----");

        // Function<T, R> Example – get length of a string
        Function<String, Integer> length = s -> s.length();
        System.out.println("Length of 'Hello': " + length.apply("Hello"));

        System.out.println("-----");

        // Supplier<T> Example – generates a random number
        Supplier<Double> random = () -> Math.random();
        System.out.println("Random number: " + random.get());

        System.out.println("-----");

        // Consumer<T> Example – prints a greeting message
        Consumer<String> printer = s -> System.out.println("Hello " + s);
        printer.accept("World");

        System.out.println("-----");

        // BiFunction<T, U, R> Example – adds two numbers
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println("1 + 1 = " + add.apply(1, 1));

        System.out.println("-----");

        // UnaryOperator<T> Example – square a number
        UnaryOperator<Integer> square = a -> a * a;
        System.out.println("Square of 4: " + square.apply(4));

        System.out.println("-----");

        // BinaryOperator<T> Example – multiply two numbers
        BinaryOperator<Integer> multiply = (a, b) -> a * b;
        System.out.println("1 * 1 = " + multiply.apply(1, 1));

        System.out.println("-----");

        // Custom Functional Interface Example
        MyPrinter printer1 = message -> System.out.println("Printing: " + message);
        printer1.print("Lambda Example");
    }

    // Declaring a custom Functional Interface
    @FunctionalInterface
    interface MyPrinter {
        void print(String message);
    }

    interface Printer {
        void print(String msg);
    }
//    BeforeJava8
//
//    interface Printer {
//        void print(String msg);
//    }
//
//    Printer p = new Printer() {
//        public void print(String msg) {
//            System.out.println("Message: " + msg);
//        }
//    };
//p.print("Hello");

//    AfterJava8

//Printer P=msg -> System.out.println("Message"+msg);
//    p.print("Hello")
}

