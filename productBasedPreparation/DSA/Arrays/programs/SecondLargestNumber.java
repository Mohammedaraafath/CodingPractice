package productBasedPreparation.DSA.Arrays.programs;

public class SecondLargestNumber {

    public static void main(String[] args) {

        // Step 1: Declare and initialize the array
        int arr[] = {10, 20, 30, 40, 50};

        // Step 2: Assume the first element is the largest
        int firstLargestElement = arr[0];

        // Step 3: Initially, second largest is the smallest possible integer
        int secondLargestElement = Integer.MIN_VALUE;

        // Step 4: Start traversing from the second element
        // because the first element is already stored in firstLargestElement
        for (int i = 1; i < arr.length; i++) {

            // Step 5: Check if the current element is greater than the current largest
            if (arr[i] > firstLargestElement) {

                // Step 6: Store the old largest as the second largest
                secondLargestElement = firstLargestElement;

                // Step 7: Update the largest with the current element
                firstLargestElement = arr[i];
            }

            // Step 8: This block executes only if the current element
            // is NOT greater than the largest.

            // Now check whether it is greater than the current second largest.
            else if (arr[i] > secondLargestElement) {

                // Step 9: Update the second largest
                secondLargestElement = arr[i];
            }
        }

        // Step 10: Print the largest element
        System.out.println("First Largest = " + firstLargestElement);

        // Step 11: Print the second largest element
        System.out.println("Second Largest = " + secondLargestElement);
    }
}