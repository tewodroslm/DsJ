package slidingWindow;

public class MaxSumSubArray {

    public static void main(String[] args) {

//        int arr[] = { 100, 200, 300, 400, 100, 300};
//        int k1arr = 2;

        int arr[] = { 1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k1arr = 4;


        System.out.println(MaxSumSubArray.maxSum(arr, arr.length, k1arr));
        System.out.println(MaxSumSubArray.maxSum(arr, arr.length, k1arr));


    }

    static int maxSum(int arr[], int n, int k){

        if(n < k){
            System.out.println("Invalid");
            return -1;
        }

        // compute sum of first window of size k
        int res = 0;
        for(int i = 0; i<k; i++)
            res += arr[i];

        // compute sum of remaining windows
        // by removing element of previous
        // wn and adding last element of current window.
        int curr_sum = res;
        for(int i = k; i < n; i++){
            System.out.println(arr[i]);
            curr_sum += arr[i] - arr[i - k];
            res = Math.max(res, curr_sum);
        }

        return res;
    }

}
