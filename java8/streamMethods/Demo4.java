package java8.streamMethods;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//sotred()
//anyMatch()
//allMatch()
//noneMatch()
//findAny
//findFirst

public class Demo4 {
    public static void main(String[] args) {
        List<Integer> numLIst= Arrays.asList(1,2,3,4,5,6,7,8,9,10,9);
        //Default wil be in ascending order
        List<Integer> sortedList = numLIst.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        //By descinding
        List<Integer> descOrder = numLIst.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(descOrder);
        //String sorting
        List<String> stringList= Arrays.asList("Araafath","Ram","Ravi","D","E","1","2","3");
        List<String> sortedStringList = stringList.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedStringList);

        List<String> descStringOrder = stringList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(descStringOrder);

        Set<String> fruits=new HashSet<String>();
        fruits.add("One apple");
        fruits.add("one Mango");
        fruits.add("Two apples");
        fruits.add("More Mangoes");
        fruits.add("Two gauves");
        boolean result = fruits.stream().anyMatch(value -> {
            return value.startsWith("One");
        });
        System.out.println(result);

        //All Match

        boolean resultforAllMatch = fruits.stream().allMatch(value -> {
            return value.startsWith("One");
        });
        System.out.println(resultforAllMatch);

        //noneMatch
        boolean resultfornoneMatch = fruits.stream().noneMatch(value -> {
            return value.startsWith("One1");
        });
        System.out.println(resultfornoneMatch);

        //finAny()---Any element returns in the collection

        List<String> nameList= Arrays.asList("Araafath","Ram","Ravi");
        Optional<String> element = nameList.stream().findAny();
        System.out.println(element.get());

        //findfirst()
        Optional<String> findFirstResult = nameList.stream().findFirst();
        System.out.println(findFirstResult.get());

        //concenate the Stream
        List<String> animalList=Arrays.asList("Dog","Cat","Elephant");
        List<String> birdList=Arrays.asList("peacock","sparrow","parrot");
        Stream<String> stream1 = animalList.stream();
        Stream<String> stream2 = birdList.stream();
        List<String> finalStream = Stream.concat(stream1, stream2).collect(Collectors.toList());
        System.out.println(finalStream);



    }
}
