package java8.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MapDemo2 {
    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "flight", "train");
        //before java 8
//        for(String name:vehicles)
//        {
//            System.out.println(name.length());
//        }

//        Using java 8
        vehicles.stream().map(name->name.length()).forEach(len-> System.out.println(len));
    }
}
