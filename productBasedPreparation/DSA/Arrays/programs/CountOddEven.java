package productBasedPreparation.DSA.Arrays.programs;

// Approach
// 1. Declare the array.
// 2. Initialize evenCount = 0 and oddCount = 0.
// 3. Traverse the array.
// 4. Check if the element is even or odd.
// 5. Increment the corresponding counter.
// 6. Print both counts.

public class CountOddEven {

    public static void main(String[] args) {

        int[] arr = {10, 15, 22, 31, 40};

        int oddCount = 0;
        int evenCount = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

        }

        System.out.println("Odd Count = " + oddCount);
        System.out.println("Even Count = " + evenCount);
    }
}