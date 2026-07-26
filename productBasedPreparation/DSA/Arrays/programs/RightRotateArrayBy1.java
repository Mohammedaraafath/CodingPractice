package productBasedPreparation.DSA.Arrays.programs;

import java.util.Arrays;

public class RightRotateArrayBy1 {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};

        // Step 1: Store the last element
        int lastElement = arr[arr.length - 1];

        // Step 2: Shift all elements one position to the right
        for (int currentIndex = arr.length - 1; currentIndex > 0; currentIndex--) {
            arr[currentIndex] = arr[currentIndex - 1];
        }

        // Step 3: Place the stored last element at the beginning
        arr[0] = lastElement;

        System.out.println(Arrays.toString(arr));
    }
}