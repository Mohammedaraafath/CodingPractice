package productBasedPreparation.DSA.Arrays.programs;

import java.util.Arrays;

public class ReverseArrayTwoPointer {
    public static void main(String[] args) {

        // Step 1: Declare and initialize the array
        int arr[] = {10, 20, 30, 40};

        // Step 2: Initialize the left pointer to the first index
        int left = 0;

        // Step 3: Initialize the right pointer to the last index
        int right = arr.length - 1;

        // Step 4: Continue until the left pointer crosses the right pointer
        while (left < right) {

            // Step 5: Store the left element in a temporary variable
            int temp = arr[left];

            // Step 6: Copy the right element to the left position
            arr[left] = arr[right];

            // Step 7: Copy the temporary value to the right position
            arr[right] = temp;

            // Step 8: Move the left pointer one step forward
            left++;

            // Step 9: Move the right pointer one step backward
            right--;
        }

        // Step 10: Print the reversed array
        System.out.println(Arrays.toString(arr));
    }
}