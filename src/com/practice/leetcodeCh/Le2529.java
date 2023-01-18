package leetcodeCh;

public class Le2529 {

    public static void main(String[] args) {
        int[] nums = {-2,-1,-1,1,2,3};
        int[] nums1 = {-3,-2,-1,0,0,1,2};
        int[] nums2 = {5,20,66,1314};

        System.out.println(Le2529.maximumCount(nums));
        System.out.println(Le2529.maximumCount(nums1));
        System.out.println(Le2529.maximumCount(nums2));

    }

    static int maximumCount(int[] nums){
        if(nums[0] > 0) return nums.length;
        int maxIs = 0;

        int i = 0;
        while(nums[i] < 0){
            maxIs += 1;
            i++;
        }
        int maxP = 0;
        if(i < nums.length-1){
            while(i < nums.length){
                if(nums[i] == 0){
                    i++;
                    continue;
                }
                maxP += 1;
                i++;
            }
        }
        return Math.max(maxIs, maxP);
    }
}
