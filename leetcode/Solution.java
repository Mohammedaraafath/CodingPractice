package leetcode;

import java.util.ArrayList;

class Solution {


    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.twoSum(new int[]{2,7,11,15},9);


    }
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for(int j=i+1;j<nums.length;j++) {
                int target1= (nums[i] + nums[j]);
            if (target1==target) {
                System.out.println("targer i got"+nums[i] + nums[j]);
              arr[0]=i;
              arr[1]=j;

            }
            }
        }

        return arr;
    }
}
