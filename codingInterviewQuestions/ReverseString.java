package codingInterviewQuestions;

import java.util.stream.IntStream;

//Reverse String
public class ReverseString {
    public static void main(String[] args) {
        String str = "araafath";
        StringBuilder stringBuilder=new StringBuilder(str);

        System.out.println(stringBuilder.reverse());
        for(int i=str.length()-1;i>=0;i--)
        {
            System.out.println(str.charAt(i));
        }
        System.out.println("using streams");
        //using stream
         IntStream.range(0,str.length())
                .map(i->str.length()-1-i)
                .forEach(i-> System.out.print(str.charAt(i)));

    }

}
