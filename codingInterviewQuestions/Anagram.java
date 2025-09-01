package codingInterviewQuestions;

import java.util.TreeMap;
import java.util.TreeSet;

public class Anagram {
    public static void main(String[] args) {
        String str1="Dormitory";
        String strt2="Dirty room";
        StringBuilder stringBuilder1=new StringBuilder();
        StringBuilder stringBuilder2=new StringBuilder();
        TreeSet<Character> set1 = new TreeSet<>();
        TreeSet<Character> set2 = new TreeSet<>();
        for(char c:str1.toCharArray())
        {
            set1.add(c);
        }
        for(Character ch:set1)
        {
            stringBuilder1.append(ch);
        }
        System.out.println(stringBuilder1);
        for(char c:strt2.toCharArray())
        {
            set2.add(c);
        }
        for(Character ch:set2)
        {
            stringBuilder2.append(ch);
        }
        System.out.println(stringBuilder2);
        if(stringBuilder1.toString().equals(stringBuilder2.toString()))
        {
            System.out.println("Given String is anagram");
        }
        else
        {
            System.out.println("Given String is not anagram");
        }

    }
}
