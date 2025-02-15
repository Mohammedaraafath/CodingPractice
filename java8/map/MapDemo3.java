package java8.map;

import java.util.Arrays;
import java.util.List;

public class MapDemo3 {
    public static void main(String[] args) {
        List<Integer> numLIst= Arrays.asList(2,3,4,5,6);

        numLIst.stream().map(multiythree->multiythree*3).forEach(System.out::println);
    }
}
