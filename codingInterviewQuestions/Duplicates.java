package codingInterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class Duplicates {
    public static void main(String[] args) {
        String str="abaacd";
        Set<Character> nonrepeat=new HashSet<>();
        String nonrepeatString;
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            nonrepeat.add(str.charAt(i));
        }
        System.out.print(nonrepeat.toString());
        for (Character charcters:nonrepeat)
        {
            stringBuilder.append(charcters);
        }
        System.out.println(stringBuilder);
    }
}
