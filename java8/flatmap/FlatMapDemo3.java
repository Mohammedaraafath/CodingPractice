package java8.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student
{
    String name;
    String sid;
    String grade;

    public Student(String name, String sid, String grade) {
        this.name = name;
        this.sid = sid;
        this.grade = grade;
    }



}
public class FlatMapDemo3 {
    public static void main(String[] args) {
        List<Student> studentList1= Arrays.asList(new Student("Ram","1","A"),
                new Student("Ravi","2","B"),
                new Student("Raja","3","c"));
        List<Student> studentList2= Arrays.asList(new Student("Ram2","12","A2"),
                new Student("Ravi2","22","B2"),
                new Student("Raja2","32","c2"));
        List<List<Student>> listList=Arrays.asList(studentList1,studentList2);
        List<String> nameList = listList.stream().flatMap(list -> list.stream().map(name -> name.name)).collect(Collectors.toList());
        System.out.println(nameList);
    }
}
