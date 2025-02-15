package java8.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mapdemo1 {
    public static void main(String[] args) {

        List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "flight", "train");
        List<String> upperCase = new ArrayList<String>();

        //before java 8 without using streams
//        for (String str : vehicles) {
//            upperCase.add(str.toUpperCase());
//        }
//        using streams
        upperCase=vehicles.stream().map(v->v.toUpperCase()).collect(Collectors.toList());
        System.out.println(upperCase);
    }

}
