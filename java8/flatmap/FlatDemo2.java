package java8.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatDemo2 {
    public static void main(String[] args) {
        List<String> teamA = Arrays.asList("Scott", "david", "John");
        List<String> teamB = Arrays.asList("Bcott", "Bavid", "Bohn");
        List<String> teamC = Arrays.asList("Ccott", "Cavid", "Cohn");
        List<List<String>> playerInWorlCup = Arrays.asList(teamA, teamB, teamC);

        //efore java 8
        for (List<String> team : playerInWorlCup) {
            for (String name : team) {
                System.out.println(name);
            }
        }


        //Using Stream flatmap
        List<String> flatMapList = playerInWorlCup.stream().flatMap(pList -> pList.stream()).collect(Collectors.toList());
        System.out.println(flatMapList);
    }
}
