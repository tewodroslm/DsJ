package leetcodeCh;

import java.util.Arrays;

public class Le268 {

    public static void main(String[] args) {
        Le268 l = new Le268();

        int list[] = { 3,0,1 };
        int list1[] = { 0,1 };
        int list2[] = { 9, 6, 4, 2, 3, 5, 7, 0, 1};

        System.out.println(l.missingNumber(list));
        System.out.println(l.missingNumber(list1));
        System.out.println(l.missingNumber(list2));

    }

    int missingNumber(int[] nums){
        int size = nums.length;
        Arrays.sort(nums);
        if(nums[size-1] != size){
            return size;
        }
        for(int i = 0; i <= size; i++){
            if(i != nums[i]) return i;
        }

        return -1;
    }

}
