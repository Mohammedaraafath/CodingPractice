package java8.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo1 {
    public static void main(String[] args) {
        //map()
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> integerList=list.stream().map(n->n+10).collect(Collectors.toList());
        System.out.println(integerList);

        //flatMap
        List<Integer> lst1=Arrays.asList(1,2);
        List<Integer> lst2=Arrays.asList(3,4);
        List<Integer> lst3=Arrays.asList(5,6);
        List<List<Integer>> finalList=Arrays.asList(lst1,lst2,lst3);
        System.out.println(finalList);
        List<Integer> finalresult=finalList.stream().flatMap(x->x.stream()).collect(Collectors.toList());
        System.out.println(finalresult);

    }
}
