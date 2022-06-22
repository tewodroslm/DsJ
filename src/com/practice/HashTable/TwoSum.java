package com.practice.HashTable;

import java.util.*;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

 */

public class TwoSum {

    public static void main(String[] args){
        
//        int[] nums = new int[]{2,4,5,6};
//        int[] nums = new int[]{2,7,11,15};
        int[] nums = new int[]{6,3,4,9,4,12};
        int target = 8;

        System.out.println(Arrays.toString(new TwoSum().twoSums(nums, target)));
        
    }

    // some how optimised better than O(n2)
    public int[] twoSums(int[] nums, int target){
        int[] returnedList = new int[2];

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        for(int i=0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                if(map.get(nums[i]).get(0) + nums[i] == target){
                    returnedList[0] = map.get(nums[i]).get(1);
                    returnedList[1] = i;
                    return returnedList;
                }
            }else {
                ArrayList<Integer> x = new ArrayList<>();
                int key = target-nums[i];
                x.add(nums[i]);
                x.add(i);
                map.put(key, x);
            }
        }

        return returnedList;
    }

    // Has time complexity of O(n2)
    public int[] twoSums1(int[] nums, int target){
        
        int[] re = new int[2];
        
        for(int i=0; i < nums.length; i++){
            for(int j=1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    re[0] = i;
                    re[1] = j;
                    return re;
                }
            }
        }
        
        return nums;
    }


}
