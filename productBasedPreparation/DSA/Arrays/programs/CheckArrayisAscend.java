package productBasedPreparation.DSA.Arrays.programs;

public class CheckArrayisAscend {

    public static void main(String[] args) {

        // Step 1: Declare the array
        int arr[] = {10, 20, 30, 40, 50};

        // Step 2: Assume the array is sorted
        boolean status = true;

        // Step 3: Traverse till the second last element
        for (int i = 0; i < arr.length - 1; i++) {

            // Step 4: Compare current element with next element
            if (arr[i] > arr[i + 1]) {

                // Step 5: Array is not sorted
                status = false;

                // Step 6: No need to check further
                break;
            }
        }

        // Step 7: Print the result
        if (status) {
            System.out.println("Given array is sorted");
        } else {
            System.out.println("Given array is not sorted");
        }
    }
}