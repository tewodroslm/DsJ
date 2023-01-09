package com.practice.RemoveElement;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {

//        int[] test = new int[]{0,1,2,2,3,0,4,2};          // [0, 1, 3, 0, 4, -, -, -]
//        int[] test = new int[]{3,2,2,3};      // [0, 1, 3, 0, 4, -, -, -]
//        int[] test = new int[]{0,1,2,2,3,0,4,2};          // [0, 1, 3, 0, 4, -, -, -]
//
//        System.out.println(RemoveElement.remDup(test, 2));
//        System.out.println(Arrays.toString(test));

//        int[] test = new int[]{0,0,1,1,1,2,2,3,3,4};      // [0, 1, 2, 3, 4, -, -, -, -, -]
//        int[] test = new int[]{1,1,2};
//        int[] test = new int[]{0,1,2,2,3,0,4,2};
//        System.out.println(RemoveElement.removeDuplicates(test));


        // 2460 apply operations to an array
//        int[] test = new int[]{1,2,2,1,1,0};                // [1,4,2,0,0,0]
//        int[] test = new int[]{0,1};
        int[] test = new int[]{847,847,0,0,0,399,416,416,879,879,206,206,206,272};
        System.out.println(RemoveElement.applyOperations(test));
    }

    //Remove Duplicates from Sorted Array
    //26. Remove Duplicates from Sorted Array
    public static int removeDuplicates(int[] nums) {
        System.out.println(Arrays.toString(nums));
        int last = nums[nums.length-1];
        if(nums.length == 1) return 1;
        int prev = nums[0];
        int var = 1;
        for(int i = 1; i <= nums.length-1; i++){
            if(nums[i] > prev){
                prev = nums[i];
                continue;
            }else {
                nums[i] = last;
                var += 1;
            }
        }

        var  = nums.length+1 - var;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        return var;
    }
    
    public static int remDup(int[] nums,int val){
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(nums[nums.length-1]);
        int high  = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val){
                nums[i] = nums[nums.length-1];
                high += 1;
            }
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        high = nums.length - high;
        return high;
    }

    //2460. Apply Operations to an Array
    public static int[] applyOperations(int[] nums) {
//        System.out.println(Arrays.toString(nums));
        // [1,2,2,1,1,0]
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                nums[i] = nums[i] * 2;
                nums[i+1] = 0;
            }else {
                continue;
            }
        }
//        System.out.println(Arrays.toString(nums));
        shiftZerosToTheEnd(new int[]{45192,0,-659,-52359,-99225,-75991,0,-15155,27382,59818,0,-30645,-17025,81209,887,64648});
        System.out.println(Arrays.toString(nums));
        return nums;
    }

    // shift 0's to the end
    private static int[] shiftZerosToTheEnd(int[] nums){
        System.out.println("****** shift method ********");

        System.out.println(Arrays.toString(nums));

        int index = 1;
        for(int j = 0; j < nums.length-1; j++){
//           System.out.println(nums[j]);    [1694,399,832,1758,412,206,272,0,0,0,0,0,0,0]
            if(nums[j] == 0 && nums[j+1] != nums[j]){
              nums[j+1-index] = nums[j+1];
              nums[j+1] = 0;

            }else if(nums[j] == 0 && nums[j+1] == nums[j]){
                index += 1;
                continue;
            }else {
                continue;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println("****** shift method END ********");
        return nums;
    }

}

/**
 *2460. Apply Operations to an Array
 * Easy
 *
 * 235
 *
 * 10
 *
 * Add to List
 *
 * Share
 * You are given a 0-indexed array nums of size n consisting of non-negative integers.
 *
 * You need to apply n - 1 operations to this array where, in the ith operation (0-indexed), you will apply the following on the ith element of nums:
 *
 * If nums[i] == nums[i + 1], then multiply nums[i] by 2 and set nums[i + 1] to 0. Otherwise, you skip this operation.
 * After performing all the operations, shift all the 0's to the end of the array.
 *
 * For example, the array [1,0,2,0,0,1] after shifting all its 0's to the end, is [1,2,1,0,0,0].
 * Return the resulting array.
 *
 * Note that the operations are applied sequentially, not all at once.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,2,1,1,0]
 * Output: [1,4,2,0,0,0]
 * Explanation: We do the following operations:
 * - i = 0: nums[0] and nums[1] are not equal, so we skip this operation.
 * - i = 1: nums[1] and nums[2] are equal, we multiply nums[1] by 2 and change nums[2] to 0. The array becomes [1,4,0,1,1,0].
 * - i = 2: nums[2] and nums[3] are not equal, so we skip this operation.
 * - i = 3: nums[3] and nums[4] are equal, we multiply nums[3] by 2 and change nums[4] to 0. The array becomes [1,4,0,2,0,0].
 * - i = 4: nums[4] and nums[5] are equal, we multiply nums[4] by 2 and change nums[5] to 0. The array becomes [1,4,0,2,0,0].
 * After that, we shift the 0's to the end, which gives the array [1,4,2,0,0,0].
 * Example 2:
 *
 * Input: nums = [0,1]
 * Output: [1,0]
 * Explanation: No operation can be applied, we just shift the 0 to the end.
 */