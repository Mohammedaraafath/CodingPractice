package java8.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee
{
    int empid;
    String empName;
    int salary;

    public Employee(int empid, String empName, int salary) {
        this.empid = empid;
        this.empName = empName;
        this.salary = salary;
    }
}

public class FilterMapDemo4 {
    public static void main(String[] args) {
        List<Employee> employeeList= Arrays.asList(new Employee(1,"Ram",1000),
                new Employee(1,"Ram",1000),
                new Employee(2,"Ravi",100000),
                new Employee(3,"Raja",1009990));
//        Combination of filter and map
        List<Integer> empsalList=employeeList.stream().
                filter(sal->sal.salary>200).
                map(sal->sal.salary)
                .collect(Collectors.toList());
        System.out.println(empsalList);

    }
}
