package leetcodeCh;

import java.util.ArrayList;
import java.util.List;

public class Le136 {

    public static void main(String[] args) {

        Le136 l = new Le136();
        int[] test = {4, 1, 2, 1, 2};
//        int[] test = {2, 2, 1};

        System.out.println("LE");
        System.out.println(l.singleNumber(test));

    }

    public int singleNumber(int[] nums){

        int i = 0;
        int index = 0;
        List<Integer> l = new ArrayList<>();
        while(i < nums.length){

            int j = i + 1;
            int count = 0;
            while(j < nums.length){
                if(nums[i] == nums[j]){
                    System.out.println(nums[i]);

                    count++;
                    break;
                }

                j++;
            }
            System.out.println("Count is " + count);
            if(!l.contains(nums[i])){
                if(count == 0 ){
                    index = nums[i];
                    System.out.println("Inside if count is 0 " + index + " i "+ i);
                    return index;
                }
            }
            l.add(nums[i]);
            i++;
        }

        return index;
    }

    public int singleNumber1(int[] nums){
        int ans = 0;
        for(int i = 0; i < nums.length; i++) {
            ans = ans ^ nums[i];
            System.out.println("Check ^ "+ans);
        }
        return ans;
    }
}
