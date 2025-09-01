package oops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Students implements Comparable<Students> {
    int roll;
    String name;

    Students(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public int compareTo(Students s) {
        return this.roll - s.roll; // natural ordering by roll
    }
}

public class TestComparable {
    public static void main(String[] args) {
        List<Students> list = List.of(
                new Students(3, "Zara"),
                new Students(1, "Araafath"),
                new Students(2, "Shan")
        );

        Students [] student = {
                new Students(3, "Zara"),
                new Students(1, "Araafath"),
                new Students(2, "Shan")};

        List<Students> students = new ArrayList<>(list);
        Collections.sort(students); // uses compareTo

        students.forEach(s -> System.out.println(s.roll + " " + s.name));

        int [] numbers={32,45,676,534,1};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(student);

    }
}
