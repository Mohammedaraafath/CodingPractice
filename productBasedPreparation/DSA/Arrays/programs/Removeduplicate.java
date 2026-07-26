package productBasedPreparation.DSA.Arrays.programs;

public class Removeduplicate {

    public static void main(String[] args) {

        // Input array (must be sorted)
        int arr[] = {1, 1, 2, 2, 3, 3, 4};

        // Step 1:
        // Assume the first element is always unique.
        // This variable stores the index of the last unique element.
        int lastUniqueIndex = 0;

        // Step 2:
        // Start checking from the second element.
        // currentIndex scans every element in the array.
        for (int currentIndex = 1; currentIndex < arr.length; currentIndex++) {

            // Step 3:
            // Compare the last unique element with the current element.
            if (arr[lastUniqueIndex] != arr[currentIndex]) {

                // Step 4:
                // A new unique element is found.
                // Move to the next position to store it.
                lastUniqueIndex++;

                // Step 5:
                // Copy the new unique element to its correct position.
                arr[lastUniqueIndex] = arr[currentIndex];
            }
        }

        // Step 6:
        // Print only the unique elements.
        System.out.println("Unique Elements:");

        for (int printIndex = 0; printIndex <= lastUniqueIndex; printIndex++) {
            System.out.print(arr[printIndex] + " ");
        }

        // Step 7:
        // Number of unique elements.
        System.out.println("\nUnique Count = " + (lastUniqueIndex + 1));
    }
}