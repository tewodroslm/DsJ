package leetcodeCh;

public class Le35 {

    public static void main(String[] args) {

        Le35 l = new Le35();
        int[] array = { 1, 3, 5, 6 };
//        int[] array = {1,2,3,4,5,10};
//        int[] array = { 1, 3, 5};
        int target = 5;
        int target1 = 2;

        int target2 = 7;
        int target3 = 3;
        int target4 = 4;
        int target11 = 1;


        System.out.println(l.searchInsert(array, target));
        System.out.println(l.searchInsert(array, target1));
        System.out.println(l.searchInsert(array, target2));
        System.out.println(l.searchInsert(array, target3));
        System.out.println(l.searchInsert(array, target4));
        System.out.println(l.searchInsert(array, target11));

    }

    public int searchInsert(int[] nums, int target){
        System.out.println("**** target *** "+target);
        int s = 0;
        int e = nums.length-1;

        if(target > nums[e]){
            return e+1;
        }else if(target <= nums[0]){
            return 0;
        }
        while(s <= e){
            int middle = (e + s) / 2;
            System.out.println("S "+ s + " e "+ e);
            System.out.println("Middle "+middle);
            if(target < nums[middle]){
                if(target < nums[middle] && target > nums[middle-1]){
                    return middle;
                }
                else {
                    e = middle - 1;
//                    continue;
                }
            }else if(target > nums[middle]){
                if(target > nums[middle] && target < nums[middle+1]){
                    return middle+1;
                }else {
                s = middle + 1;}
            }else {
                return middle;
            }

        }



        return -1;
    }


}

// Search insert Position

/**Given a sorted array of distinct integers and a target value,
 * return the index if the target is found. If not, return the index where
 * it would be if it were inserted in order.


 You must write an algorithm with O(log n) runtime complexity
 **/











