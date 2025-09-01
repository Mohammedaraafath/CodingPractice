package codingInterviewQuestions;

//ab12pq34" Find sum of digits in this string
public class SumOfGivenString {
    public static void main(String[] args) {
        String str="ab12pq34";
        int sum=0;
        for(int i=0;i<str.length();i++)
        {
            System.out.println(str.charAt(i));
            if(Character.isDigit(str.charAt(i)))
            {
                sum=sum+Character.getNumericValue(str.charAt(i));
            }

        }
        System.out.println(sum);


        //using map
        int streamsum=str.chars().filter(Character::isDigit).map(Character::getNumericValue).sum();
        System.out.println(streamsum);
    }
}
