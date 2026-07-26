package productBasedPreparation.DSA.Arrays.programs;

import java.util.Arrays;

public class DeleteElementArray {
    public static void main(String[] args) {
        int arr[]= {10, 20, 30, 40, 50};
        int deleteIndex=2;
        for(int i=deleteIndex;i<arr.length-3;i++)
        {
            arr[i]=arr[i+1];
        }
        System.out.println(Arrays.toString(arr));
    }
}
