package com.jagadeeswara.algorithms.hard;

public class RainWaterTrap {
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 4, 1, 0, 1,
                3, 2, 1, 2, 1};
        //int n = arr.length;

        System.out.println("Maximum water that "
                + "can be accumulated is "
                + trap(arr));
        System.out.println("Hello World!");
    }

    public static int trap(int[] arr) {
        // initialize output
        int result = 0;

        // maximum element on left and right
        int left_max = 0, right_max = 0;

        // indices to traverse the array
        int lo = 0, hi = arr.length - 1;

        while(lo<=hi){
            if(arr[lo]<arr[hi]){
                if(arr[lo] <= left_max){
                    result = result + left_max - arr[lo];
                }else{
                    left_max = arr[lo];
                }
                lo++;

            }else{
                if(arr[hi] <= right_max){
                    result = result + right_max - arr[hi];
                }else{
                    right_max = arr[hi];
                }
                hi--;


            }
        }

        return result;
    }
}
