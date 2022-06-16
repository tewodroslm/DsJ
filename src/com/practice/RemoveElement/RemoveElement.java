package com.practice.RemoveElement;

import java.util.Arrays;

public class RemoveElement {
    public int remDup(int[] nums,int val){
        System.out.println(Arrays.toString(nums));
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                // reduce array size by one
                n--;
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        //[0,1,4,0,3]
        return n;
    }
}
