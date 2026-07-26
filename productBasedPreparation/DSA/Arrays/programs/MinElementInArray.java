package productBasedPreparation.DSA.Arrays.programs;
// Approach
// 1. Declare the array.
// 2. Assume the first element is the minimum.
// 3. Traverse the remaining elements.
// 4. Compare each element with the current minimum.
// 5. If a smaller element is found, update the minimum.
// 6. Print the minimum element.
public class MinElementInArray {
    public static void main(String[] args) {
        int arr[]={10, 45, 20, 80, 30};
        int min= arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
