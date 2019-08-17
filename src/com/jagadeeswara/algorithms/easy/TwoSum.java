package com.jagadeeswara.algorithms.easy;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int targetvalue = 9;
        int[] retrurnedVal = twoSum(nums,targetvalue);
        System.out.println(retrurnedVal[0]);
        System.out.println(retrurnedVal[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] returnVal = new int[2];

        for(int i=0;i < nums.length ; i++){
            for(int j=i+1;j < nums.length; i++){
                if(nums[i] + nums[j] == target){
                    returnVal[0] = i;
                    returnVal[1] = j;
                    return returnVal;
                }
            }
        }

        return returnVal;
    }
}
