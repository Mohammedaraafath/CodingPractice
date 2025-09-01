package oops;

import java.util.*;

class Student {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

public class TestComparator {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(2, "Zara", 23));
        list.add(new Student(1, "Shan", 22));
        list.add(new Student(2, "Araafath", 25));
        list.add(new Student(1, "Araafath", 21));
        list.add(new Student(1, "Araafath", 20));

        // ✅ Comparator: id → name → age
        Comparator<Student> comparator = Comparator
                .comparingInt((Student s) -> s.id)             // primary: id
                .thenComparing(s -> s.name)                   // secondary: name
                .thenComparingInt(s -> s.age);                // tertiary: age

        Collections.sort(list, comparator);

        list.forEach(s ->
                System.out.println(s.id + " " + s.name + " " + s.age));
    }
}
