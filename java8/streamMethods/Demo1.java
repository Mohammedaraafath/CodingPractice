package java8.streamMethods;

//distinct()  limit()---terminal method
//count() NonTerminal Method

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {
        List<String> vehicleList= Arrays.asList("bus","car","car","bus","bike","train","flight");
        List<String> distinctList = vehicleList.stream().distinct().collect(Collectors.toList());
        //distinct+ foreach
        vehicleList.stream().distinct().forEach(n-> System.out.println(n));
        //count
        long count=vehicleList.stream().distinct().count();
        System.out.println(count);
        System.out.println(distinctList);
        List<String> limitList = vehicleList.stream().distinct().limit(3).collect(Collectors.toList());
        System.out.println(limitList);

    }
}
