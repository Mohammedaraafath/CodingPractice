package productBasedPreparation.DSA.Arrays.programs;

// Array = {10, 20, 30, 40, 50}
// Search = 30
// Output:
// Element found at index 2

// Approach
// 1. Declare the array.
// 2. Declare the element to search.
// 3. Traverse the array.
// 4. Compare each element with the search element.
// 5. If found, store the index and stop the loop.
// 6. If the index is not -1, print it.
// 7. Otherwise, print "Element not found".

public class LinerarSearch {
    public static void main(String[] args) {
        int arr[]={10, 20, 30, 40, 50};
        int searchElement=30;
        int foundIndex=-1;
        for (int i=0;i<arr.length;i++)
        {
            if(searchElement==arr[i])
            {
                foundIndex=i;
                break;
            }
        }
        if(foundIndex!=-1)
        {
            System.out.println(foundIndex);
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}
