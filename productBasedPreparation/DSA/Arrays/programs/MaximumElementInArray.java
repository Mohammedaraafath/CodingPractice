package productBasedPreparation.DSA.Arrays.programs;
//Aprroach
//Assume first element is largest.
//Look at next element.
//Compare.
//        If bigger, update largest.
//Continue till the end.
//Print largest.  o(n)
public class MaximumElementInArray {
    public static void main(String[] args) {
        int arr[]={10, 45, 20, 80, 30};
        //          0  1   2   3   4
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
