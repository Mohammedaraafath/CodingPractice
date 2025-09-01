package codingInterviewQuestions;

import java.util.Arrays;
import java.util.Collections;

public class SortingArray {
    public static void main(String[] args) {
        //using array.sort
        Integer array[]={1,2,3,4};
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));

        //using streams
        Integer sortedArray[]=Arrays.stream(array).sorted((a,b)->b-a).toArray(Integer[]::new);
        for(int a:sortedArray)
        System.out.println(a);

        //using lambda expression
        Arrays.sort(array,(a,b)->a-b);
        System.out.println(Arrays.toString(array));

        //using comparator

    }
}
