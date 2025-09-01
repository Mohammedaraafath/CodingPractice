package leetcode;

public class Reverse {
    public int reverse(int x) {
        int rev=0;
        while (x != 0)
        {
            int modulovalue=x%10;
            System.out.println(modulovalue);
            rev=rev*10+modulovalue;
             x=x/10;
            System.out.println(x);
        }
        System.out.println(rev);
        return rev;

    }

    public static void main(String[] args) {
        Reverse reverse=new Reverse();
        reverse.reverse(1534236469

        );
    }
}

