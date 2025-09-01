package leetcode;

import java.util.HashMap;

public class IntegerToRoman {
    public String intToRoman(int num) {
        HashMap<Integer,String> values=new HashMap<>();
        values.put(1,"I");
        values.put(5,"V");
        values.put(10,"X");
        values.put(50,"L");
        values.put(100,"C");
        values.put(500,"D");
        values.put(1000,"M");
        System.out.println(values);
        while(num!=0)
        {

            int thousands = num / 1000;       // 3
            num = num % 1000;                   // remainder 749

            int fiveHundreds = num / 500;     // 1
            num = num % 500;                    // remainder 249

            int hundreds = num / 100;         // 2
            num = num % 100;

            System.out.println(thousands);
        }
        return null;
    }

    public static void main(String[] args) {
        IntegerToRoman integerToRoman =new IntegerToRoman();
        integerToRoman.intToRoman(3749);
    }
}
