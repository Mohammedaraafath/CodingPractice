package java8.streamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo3 {
    public static void main(String[] args) {
        //reduce()
        List<String> stringList= Arrays.asList("A","B","C","D","E","1","2","3");
        Optional<String> reduceString = stringList.stream().reduce((value, combineValue) -> {
            return combineValue + value;
        });
        System.out.println(reduceString.get());

        //toArray
        Object[] arr = stringList.stream().toArray();
        System.out.println(arr.length);
        for (Object val:arr) {
            System.out.println(val);
        }

    }
}
