package productBasedPreparation.DSA.Arrays.programs;

// Approach
// 1. Declare the array.
// 2. Start the loop from the last index (arr.length - 1).
// 3. Traverse the array backwards until index 0.
// 4. Print each element.

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        for (int i=arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }
}
