package productBasedPreparation.DSA.Arrays.programs;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int arr[]={1,0,0, 3,12};
        int scanner=0;
        for(int currentindex=0;currentindex<arr.length;currentindex++)
        {
            if(arr[currentindex]!=0)
            {
              int temp=arr[currentindex];
              arr[currentindex]=arr[scanner];
              arr[scanner]=temp;
              scanner++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
