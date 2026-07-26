package productBasedPreparation.DSA.Arrays.programs;

import java.util.Arrays;

public class LeftRotateArrayby1 {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};

        // Step 1: Store the first element
        int firstElement = arr[0];

        // Step 2: Shift every element one position to the left
        for(int currentIndex = 1; currentIndex < arr.length; currentIndex++)
        {
            arr[currentIndex - 1] = arr[currentIndex];
        }

        // Step 3: Place the first element at the end
        arr[arr.length - 1] = firstElement;

        System.out.println(Arrays.toString(arr));
    }
}