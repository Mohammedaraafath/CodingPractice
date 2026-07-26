package productBasedPreparation.DSA.Arrays.programs;

//Array = {10, 20, 30, 40, 50}
//
//Insert = 25
//
//Index = 2
//Approach
//Declare the array
//get the input from user where to insert and what to insert
//{10, 20, 30, 40, 50}
//new array [10, 20, 30, 40, 50, 0]
//          {10, 20, 25, 30, 40, 50}
//Declare new array


import java.util.Arrays;

public class InsertElementArray {
    public static void main(String[] args) {
        int arr[]={10, 20, 30, 40, 50};
        int insertElement=25;
        int insertIndex=2;
        int[] newArr = new int[6];
        for(int i=0;i<arr.length;i++)
        {
            newArr[i]=arr[i];
        }
        int lastIndex=newArr.length-1;
        //50
        for(int i=lastIndex;i>=insertIndex;i--)
        {
            newArr[i]=newArr[i-1];
            if(i==insertIndex)
            {
                newArr[2]=insertElement;
            }

        }
        System.out.println(Arrays.toString(newArr));



    }
}
