package codingInterviewQuestions;

import leetcode.IntegerToRoman;

import java.util.HashMap;

public class CountOccurence
{
    public static void main(String[] args) {
        String word = "araafath hello";
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char c : word.toCharArray())
        {

            System.out.println(c);
            hashMap.put(c,hashMap.getOrDefault(c,0)+1);
        }
        System.out.println(hashMap);

        String longword="Hi Hello Hi Hello Araafath";
        HashMap<String, Integer> longMap = new HashMap<>();
        for(String words:longword.split("\\s"))
        {
            System.out.println(words);
            longMap.put(words,longMap.getOrDefault(words,0)+1);
        }
        System.out.println(longMap);

    }
}
