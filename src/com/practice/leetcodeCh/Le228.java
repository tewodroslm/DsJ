package leetcodeCh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Le228 {
    public static void main(String[] args) {
//        int[] test = new int[]{0,1,2,4,5,7};
//        int[] test = new int[]{0,2,3,4,6,8,9};
//        int[] test = new int[]{-1};
//        int[] test = new int[]{0,1,2};
        int[] test = new int[]{1,3};
        System.out.println(summaryRanges(test));
    }

    public static List<String> summaryRanges(int[] nums) {
        System.out.println(Arrays.toString(nums));
        List<String> list = new ArrayList<>();
        if(nums.length == 1){
            list.add(String.valueOf(nums[0]));
            return list;
        }
        int start = nums[0];
        int last = nums[nums.length-1];
        if(nums[1] - start != 1){
            list.add(String.valueOf(start));
            start = nums[1];
        }
        for(int i = 1 ; i < nums.length; i++){
            System.out.println("**** nums i ");
            System.out.println(nums[i]);
            System.out.println("**** nums i + 1 ");
            if(nums[i] != last){
                if(nums[i] - nums[i-1] != 1 && nums[i] - nums[i+1] != -1){
                    System.out.println(nums[i]);
                    list.add(String.valueOf(nums[i]));
                    start = nums[i+1];
                }else if(nums[i] - nums[i+1] != -1){
                    list.add(start + "->" + nums[i]);
                    start = nums[i+1];
                }else{
                    continue;
                }

            }else if(nums[i] == last && nums[i] - nums[i-1] == 1){
                list.add(start + "->" + nums[i]);
            }else if(nums.length > 3){
                if(nums[i] == last && nums[i] - nums[i-1] != 1 && nums[i-1]-nums[i-2]!=1){
                    list.add(String.valueOf(nums[i-1]));
                    list.add(String.valueOf(nums[i]));
                }else{
                    list.add(String.valueOf(nums[i]));
                }
            }else{
                list.add(String.valueOf(nums[i]));
            }
        }
        System.out.println("*** Final List ****");
        System.out.println(list);
        return list;
    }
}

/**
 * 228. Summary Ranges
 * Easy
 *
 * 2360
 *
 * 1294
 *
 * Add to List
 *
 * Share
 * You are given a sorted unique integer array nums.
 *
 * A range [a,b] is the set of all integers from a to b (inclusive).
 *
 * Return the smallest sorted list of ranges that cover all the numbers in the array exactly.
 * That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.
 *
 * Each range [a,b] in the list should be output as:
 *
 * "a->b" if a != b
 * "a" if a == b
 *
 *
 * Example 1:
 *
 * Input: nums = [0,1,2,4,5,7]
 * Output: ["0->2","4->5","7"]
 * Explanation: The ranges are:
 * [0,2] --> "0->2"
 * [4,5] --> "4->5"
 * [7,7] --> "7"
 * Example 2:
 *
 * Input: nums = [0,2,3,4,6,8,9]
 * Output: ["0","2->4","6","8->9"]
 * Explanation: The ranges are:
 * [0,0] --> "0"
 * [2,4] --> "2->4"
 * [6,6] --> "6"
 * [8,9] --> "8->9"
 */
