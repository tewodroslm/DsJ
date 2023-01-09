package dynamicPr10;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;

public class DynamicProg10 {

    /*
    DYNAMIC PROGRAMMING is an algorithmic paradigm that solves a given
    complex problem by breaking it into problems using recursion and storing the results
    of problems to avoid computing the same results
    again.
     */

    static HashMap<Integer, Long> hm = new HashMap<>();

    public static void main(String[] args) {

        // starter using TABULATION
//        int test = 3;
//        int test1 = 5;
//        int test2 = 8;
//        int test3 = 1;
//        System.out.println(DynamicProg10.factorialUsingTabulation(test));
//        System.out.println(DynamicProg10.factorialUsingTabulation(test1));
//        System.out.println(DynamicProg10.factorialUsingTabulation(test2));
//        System.out.println(DynamicProg10.factorialUsingTabulation(test3));
//
//        // starter using RECURSION
//        System.out.println(DynamicProg10.factorialUsingRecursion(test));
//        System.out.println(DynamicProg10.factorialUsingRecursion(test1));
//        System.out.println(DynamicProg10.factorialUsingRecursion(test2));
//        System.out.println(DynamicProg10.factorialUsingRecursion(test3));
        /**
         *     ******    EAZY      *******
         */
        // FIB
//        int test = 3;
//        int test2 = 2;
//        int tes3 = 9;
//        int test4 = 10;
//        int test5 = 50;
//        System.out.println(DynamicProg10.fibonacci(test));
//        System.out.println(DynamicProg10.fibonacci(test2));
//        System.out.println(DynamicProg10.fibonacci(tes3));
//        System.out.println(DynamicProg10.fibonacci(test4));
//        System.out.println(DynamicProg10.fibonacci(test5));
//
//        System.out.println("*******");
//        System.out.println(DynamicProg10.fibUsingDp(test));
//        System.out.println(DynamicProg10.fibUsingDp(test2));
//        System.out.println(DynamicProg10.fibUsingDp(tes3));
//        System.out.println(DynamicProg10.fibUsingDp(test4));
//        System.out.println(DynamicProg10.fibUsingDp(test5));
//
//        System.out.println("*** space optimized method ****");
//        System.out.println(DynamicProg10.fibSpaceOp(test));
//        System.out.println(DynamicProg10.fibSpaceOp(test2));
//        System.out.println(DynamicProg10.fibSpaceOp(tes3));
//        System.out.println(DynamicProg10.fibSpaceOp(test4));
//        System.out.println(DynamicProg10.fibSpaceOp(test5));
//
//        Arrays.fill(dp, -1);
//        System.out.println("*** space optimized TD method ****");
//        System.out.println(DynamicProg10.fibTopDown(test));
//        System.out.println(DynamicProg10.fibTopDown(test2));
//        System.out.println(DynamicProg10.fibTopDown(tes3));
//        System.out.println(DynamicProg10.fibTopDown(test4));
//        System.out.println(DynamicProg10.fibTopDown(test5));

        // END OF FIB --------------------------------------------------

        // nth CATALAN NUMBER
        // Catalan numbers are defined as a mathematical sequence that consists of positive int,
        // which can be used to find the number of possibilities of various combinations.

        // N = 0, 1, 2, 3, .. are 1,1,2,5,14,42,132,429,1430,4862,...
        hm.clear();
//        int test = 5;
//        int test2 = 4;
//        int test5 = 20;
//
//        System.out.println(DynamicProg10.findCatalan(test2));
//        System.out.println(DynamicProg10.findCatalan(test));
//        System.out.println(DynamicProg10.findCatalan(test5));
//        System.out.println("****** step 2 *****");
//        System.out.println(DynamicProg10.catalanDp(test2));
//        System.out.println(DynamicProg10.catalanDp(test));
//        System.out.println(DynamicProg10.catalanDp(test5));
//
//        System.out.println("****** step 3 cat  *****");
//
//        System.out.println(DynamicProg10.catalanBinomial(test2));
//        System.out.println(DynamicProg10.catalanBinomial(test));
//        System.out.println(DynamicProg10.catalanBinomial(test5));
//
//        System.out.println("****** step 4 cat bigint  *****");
//
//        System.out.println(DynamicProg10.findCatalanBigInt(test2));
//        System.out.println(DynamicProg10.findCatalanBigInt(test));
//        System.out.println(DynamicProg10.findCatalanBigInt(test5));

        // count coins
//        int[] amount = {1, 2, 3};
//        System.out.println(DynamicProg10.countCoin1(amount, amount.length, 4));
//        System.out.println(DynamicProg10.countWaysBUMemo(amount, amount.length, 4));

        // sum subset
//        int[] set = {3, 34, 4, 12, 5, 2};
//
//        System.out.println(DynamicProg10.subSetSum(set, set.length, 9));

        // cutting a rod | dp-13
        int[] arr = { 1, 5, 8, 9, 10, 17, 17, 20};
        int n = arr.length;
        System.out.println(DynamicProg10.cutRod(arr, n-1, n));
    }

    // just for convenience

    // Cuttin a rod | dp-13
    static int cutRod(int price[], int index, int n){
        if(index == 0){
            return n * price[0];
        }
        int notCut = cutRod(price, index -1, n);
        System.out.println("***** no Cut ****");
        System.out.println(notCut);

        int cut = Integer.MIN_VALUE;
        int rod_length = index + 1;

        System.out.println(rod_length);

        if(rod_length <= n) {
            System.out.println("*** in side of if ***");
            cut = price[index] +
                    cutRod(price, index, n - rod_length);
            System.out.println(cut);
        }
        return Math.max(notCut, cut);
    }

    //
    static long countWays(int n, int k){
        long[] dp = new long[n + 1];
        Arrays.fill(dp, 0);
        int mod = 100000007;

        dp[1] = k;

        int same = 0, diff = k;

        for(int i = 2; i <= n; i++){
            same  = diff;
            diff = (int) (dp[i-1] * (k -1));
            diff = diff % mod;

            dp[i] = (same + diff) % mod;
        }
        return dp[n];
    }

    //longest common subsequence
    static int lcs(char[] x, char[] y, int m, int n){
        if(m == 0 || n == 0)
            return 0;
        if(x[m-1] == y[n-1])
            return 1+lcs(x, y, m-1, n-1);
        else
            return max(lcs(x, y, m, n-1), lcs(x, y, m-1, n));
    }
    static int max(int a, int b){
        return (a > b) ? a : b;
    }

    ///////////// ----- not 34u4i4iu4uu3if99873733##$$#VC#F$%^&NGG5545

    // starter --> tabulation ex
    static int factorialUsingTabulation(int number){
        int finalVal = 1;
        for(int i = 1; i <= number; i++){
            finalVal = finalVal * i;
        }
        return finalVal;
    }

    // starter --> recursion ex
    static int factorialUsingRecursion(int number){
        if(number == 1) return 1;
        return number * factorialUsingRecursion(number - 1);
    }

    /**
     *     ******    EAZY      *******
     */

    // only recursion  -> is slower if not Memoized(but this is Memoized)
    static long fibonacci(int number){
        if(number <= 1 ) {
            return number;
        }
        long i;
        if(hm.containsKey(number)) {
            return hm.get(number);
        }

        i = fibonacci(number-2) + fibonacci(number-1);
        hm.put(number, i);

         return i;
    }

    // FIB using dynamic programming -> is faster somehow
    static long fibUsingDp(int number){
        long f[] =  new long[number+2];
        int i;

        f[0] = 0;
        f[1] = 1;
        for(i = 2; i <= number; i++){
            f[i] = f[i-1] + f[i-2];
        }
        return f[number];
    }

    // FIB (space optimized method) (time complexity: 0(n) and space 0(1)
    static long fibSpaceOp(int n){
        long a = 0, b = 1, c;
        if(n == 0)
            return a;
        for(int i = 2; i <= n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    // FIB using memoization( Top-down approach)
//    static long[] dp = new long[51];
//    static long fibTopDown(int n){
//        if(n <= 1)
//            return n;
//        long first, second;
//        if(dp[n-1] != -1)
//            first = dp[n-1];
//        else
//            first = fibTopDown(n-1);
//        if(dp[n-2] != -1)
//            second = dp[n-2];
//        else
//            second = fibTopDown(n-2);
//
//        return dp[n] = first + second;
//    }

    // END OF FIB --------------------------------------------------

    // nth Catalan Number

    // starter --> catalan using recursive and memorizing
    static long findCatalan(int n){
        long res = 0;
        if(n <= 1)
            return 1;
        if(hm.containsKey(n)){
            return hm.get(n);
        }

        for(int i=0; i<n; i++){
            res += findCatalan(i) * findCatalan(n - i - 1);
            hm.put(n, res);
        }

        return res;
    }

    // Using BigInteger for N > 80, using long is not enough

    static BigInteger findCatalanBigInt(int n){
         BigInteger b = new BigInteger("1");

         // calc n!
         for(int i = 1; i <= n; i++){
             b = b.multiply(BigInteger.valueOf(i));
         }

        System.out.println("**** b ***");
        System.out.println(b);

         // calculate n! * n!
         b = b.multiply(b);
         BigInteger d = new BigInteger("1");

         // calculating (2n)!
        for(int i = 1; i <= 2* n; i++){
            d = d.multiply(BigInteger.valueOf(i));
        }

        // calc (2n)! / (n! * n!)
        BigInteger ans = d.divide(b);

        // calc (2n)! / ((n! * n!) * (n+1))
        ans = ans.divide(BigInteger.valueOf(n + 1));
        return ans;
    }

    // using loop
    // timecomplexity : 0(n2)
    // auxilary space : 0(n)
    static long catalanDp(int n){
        long[] catalan = new long[n+2];
        catalan[0] = 1;
        catalan[1] = 1;

        // fill the entries in catalan[]
        for(int i = 2; i <= n; i++){
            catalan[i] = 0;
            for(int j = 0; j < i; j++){
                catalan[i] += catalan[j] * catalan[i - j - 1];
            }
        }
        return catalan[n];
    }

    // using Binomial coefficient soln for Catalan nums
    /// --- multiple method ---

    // returns value of binomial coefficent c(n,k)
    static long binomialCoeff(int n, int k){
        long res = 1;

        // since C(n , k) = c(n, n-k)
        if(k > n - k){
            k = n - k;
        }

        // calc value of [n*(n-1)*---*(n-k+1)]/
        //               [k*(k-1)* --- *1]
        for(int i = 0; i < k; ++i){
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }
    static long catalanBinomial(int n){
        long c = binomialCoeff(2 * n, n);
        return c / (n + 1);
    }
    // TC 0(n)
    // S  0(1)
    // --- END Mulitple method for cat ---


    // BELL NUMBERS(number of ways to Partition a set)
    // given a set of n elem, find nums of way of partitioning it.
    // .. marked (not done)

    // Binomial coefficient
    static int binomialCoeff2(int n, int k){
        if(k > n)
            return 0;
        if(k == 0 || k == n)
            return 1;
        int v =  binomialCoeff2(n-1, k-1) + binomialCoeff2(n-1, k);
        return v;
    }


    // Coin change | dp-7
    // approach 1
    static int countCoin1(int coins[], int n, int sum){
        // if sum is 0 -> 1 solution
        if(sum == 0){
            return 1;
        }
        if(sum < 0)
            return 0;

        if(n <= 0)
            return 0;

        return countCoin1(coins, n-1, sum) + countCoin1(coins, n, sum-coins[n-1]);
    }

    // coin change using Bottom up Memoization
    static long countWaysBUMemo(int coins[], int n, int sum){
        long[]  table = new long[sum + 1];
        Arrays.fill(table, 0);

        table[0] = 1;
        for (int i = 0; i < n; i++){
            for(int j = coins[i]; j <= sum; j++)
                table[j] += table[j - coins[i]];
        }
        return table[sum];
    }

    // SUBSET Sum problem
    static boolean subSetSum(int[] set, int n, int sum){
        if(sum == 0)
            return true;
        if(n == 0)
            return false;

        if(set[n-1] > sum)
            return subSetSum(set, n - 1, sum);

        return subSetSum(set, n - 1, sum) ||
                subSetSum(set, n - 1, sum - set[n- 1]);
    }


    static int nCrModp(int n, int r, int p){
        if(r > n -r)
            r = n - r;

        int[] C = new int[r + 1];
        C[0] = 1;

        for(int i = 1; i <= n; i++){
            for(int j = Math.min(i, r); j > 0; j--){
                C[j] = (C[j] + C[j-1]) % p;
            }
        }
        return C[r];
    }
    /**
     *     ******    MEDIUM     *******
     */

}




















































