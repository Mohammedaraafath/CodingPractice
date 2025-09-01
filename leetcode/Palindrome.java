package leetcode;

public class Palindrome {
    public boolean isPalindrome(int x) {
        int originalString=x;
        int rev=0;
        if(x<0)
        {
            return false;
        }
        while(x!=0)
        {
            int modulovalue=x%10;
            rev=rev*10+modulovalue;
            x=x/10;
        }
        if(originalString==rev)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
        Palindrome palindrome =new Palindrome();
        System.out.println(palindrome.isPalindrome(121));
    }
}
