package java8.streamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) {
        List<Integer> numLIst= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> evenNumb = numLIst.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumb);
        long countEvenNUmber=numLIst.stream().filter(n -> n % 2 == 0).count();
        System.out.println(countEvenNUmber);
        //min()
        Optional<Integer> minValue = numLIst.stream().min((val1, val2) -> {
            return val1.compareTo(val2);
        });
        System.out.println(minValue.get());
        //max
        Optional<Integer> maxValue = numLIst.stream().max((val1, val2) -> {
            return val1.compareTo(val2);
        });
        System.out.println(maxValue.get());
    }
}
