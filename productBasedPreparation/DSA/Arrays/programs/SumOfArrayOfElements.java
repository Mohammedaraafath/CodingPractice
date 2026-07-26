package productBasedPreparation.DSA.Arrays.programs;

// Approach
// 1. Declare the array.
// 2. Initialize sum = 0.
// 3. Traverse the array.
// 4. Add each element to sum.
// 5. Print the final sum.

public class SumOfArrayOfElements {
    public static void main(String[] args) {
        int arr[]= {10, 20, 30, 40, 50};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
