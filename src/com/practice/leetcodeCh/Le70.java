package leetcodeCh;

import java.util.HashMap;

public class Le70 {
    HashMap<Integer, Integer> hm = new HashMap<>();
    public static void main(String[] args) {
        Le70 l =  new Le70();
        int n = 2;
        int n1 = 3;
        int n4 = 4;
        int n5 = 45;

        System.out.println(l.climbStairs(n));
        System.out.println(l.climbStairs(n1));
        System.out.println(l.climbStairs(n4));
        System.out.println(l.climbStairs(n5));
    }


    int climbStairs(int n){
        if(hm.containsKey(n)){
            return hm.get(n);
        }
        if(n <= 1) return 1;

        int x = climbStairs(n-1) + climbStairs(n-2);
        hm.put(n, x);
        return x;
    }

}


/*

base case 1 and 0
if n <= 1
   return 1;

return function(n)+1

 */