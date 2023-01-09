package array;

import java.util.*;

public class AlmostIncreasingSequence {
    public static void main(String[] args) {
//        int[] test = new int[]{1,3,2,1};
//        int[] test = new int[]{1,3,2};
//        int[] test = new int[]{1, 2, 1, 2};
//        int[] test = new int[]{40, 50, 60, 10, 20, 30};
//        int[] test = new int[]{1, 2, 5, 3, 5};
//        int[] test = new int[]{1, 2, 3, 4, 3, 6};
//        int[] test = new int[]{1, 2, 3, 4, 99, 5, 6};
//        int[] test = new int[]{3, 5, 67, 98, 3};
//        System.out.println(AlmostIncreasingSequence.solution(test));
//        int te = 1988;
//        int te = 1700;
//        int te = 1601;
//        System.out.println(AlmostIncreasingSequence.sol(te));


        // check palindrome
//        String inputString = "aabaa";
//        String inputString = "abac";
//        String inputString = "a";
//        String inputString = "hlbeeykoqqqqokyeeblh";
//        String inputString = "baab";
//        String inputString = "az";
//        String inputString = "aaabaaaa";
//        System.out.println(inputString.length());
//        System.out.println(AlmostIncreasingSequence.solCheckPalindrome(inputString));

        // adjecent elements product
//        int[] test = new int[]{3, 6, -2, -5, 7, 3};
//        System.out.println(AlmostIncreasingSequence.solAdjacentElm(test));

        // shape area
//        int n = 2;
//        int n = 3;
//        int n = 4;
//        System.out.println(AlmostIncreasingSequence.solShapeArea(n));

        // Make array consecutive
//        int[] test = new int[]{6, 2, 3, 8};
//        System.out.println(AlmostIncreasingSequence.makeArrayConsecutive(test));

        // almost increasing
//        int[] test1 = new int[]{1, 2, 1, 2};
//        int[] test2 = new int[]{1,3,2,1};
//        int[] test3 = new int[]{1,3,2};
//        int[] test4 = new int[]{ 1, 2, 3, 4, 3, 6};
//        int[] test5 = new int[]{ 3, 6, 5, 8, 10, 20, 15};
//        int[] test6 = new int[]{ 10, 1, 2, 3, 4, 5};
//        int[] test7 = new int[]{40, 50, 60, 10, 20, 30};
//        int[] test8 = new int[]{3, 5, 67, 98, 3};
//        System.out.println(AlmostIncreasingSequence.almostInc(test1));
//        System.out.println(AlmostIncreasingSequence.almostInc(test2));
//        System.out.println(AlmostIncreasingSequence.almostInc(test3));
//        System.out.println(AlmostIncreasingSequence.almostInc(test4));
//        System.out.println(AlmostIncreasingSequence.almostInc(test5));
//        System.out.println(AlmostIncreasingSequence.almostInc(test6));
//        System.out.println(AlmostIncreasingSequence.almostInc(test7));
//        System.out.println(AlmostIncreasingSequence.almostInc(test8));


//        // Matrix Elements Sum
//        int[][] matrix = {{0, 1, 1, 2}, {0, 5, 0, 0}, {2, 0, 3, 3}};
//        int[][] matrix1 = {{1, 1, 1, 0}, {0, 5, 0, 1}, {2, 1, 3, 10}};
//        int[][] matrix3= {{1, 1, 1, 0}, {0, 5, 0, 1}, {2, 1, 3, 10}, {1, 1, 1, 1}};
//        int[][] matrix4= {{ 0}, {1}, {2}, {1 }};
//        int[][] matrix5 = {{ 0}};
//
//        System.out.println(AlmostIncreasingSequence.solutionMatrixElementSum(matrix));
//        System.out.println(AlmostIncreasingSequence.solutionMatrixElementSum(matrix1));
//        System.out.println(AlmostIncreasingSequence.solutionMatrixElementSum(matrix3));
//        System.out.println(AlmostIncreasingSequence.solutionMatrixElementSum(matrix4));
//        System.out.println(AlmostIncreasingSequence.solutionMatrixElementSum(matrix5));
     }

    // Matrix Elements Sum
    static int solutionMatrixElementSum(int[][] matrix){
        int total = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(i > 1){
                    if(matrix[i-1][j] != 0 && matrix[i-2][j] != 0){
                        total+=matrix[i][j];
                    }

                }else if(i > 0) {
                    if(matrix[i-1][j] == 0){
                        matrix[i][j] = 0;
                    }
                    if(matrix[i-1][j] != 0 && matrix[i][j] != 0){
                        total+=matrix[i][j];
                    }
                }else {
                    if(matrix.length != 1){
                        if(matrix[i][j] == 0){
                            matrix[i+1][j] = 0;
                        }

                    }
                    if(matrix[i][j] != 0){
                        total+=matrix[i][j];
                    }
                }
            }
        }
        return total;
    }

    // almost increasing
    static boolean almostInc(int[] sequence){
        int count1 = 0, count2 = 0;
        for(int i=0; i< sequence.length-1; i++){
            if(sequence[i] >= sequence[i+1]) count1++;
        }
        for(int i = 0; i < sequence.length-2; i++){
            if(sequence[i] >= sequence[i+2]) count2++;
        }
        return (count1 <= 1) && (count2 <= 1);

    }

    // Make Array Consecutive 2
    static int makeArrayConsecutive(int[] statues){
        Arrays.sort(statues);
        System.out.println(Arrays.toString(statues));
        int val = 0;
        for(int i = 1; i < statues.length; i++){
//            System.out.println(statues[i]);
            if(statues[i] - (statues[i-1]) != 1){
                val = statues[i] - statues[i-1] - 1 + val;
            }else{
                continue;
            }
        }
        return val;
    }

    // shape area
    static int solShapeArea(int n){
        /*
        1 -> 1
        2 -> 5             4
        3 -> 13               8
        4 -> 25                 12
         */
        if(n == 1) return 1;
        int val = 1;
        int add = 0;
        for(int i = 2; i <= n; i++){
            add = add + 4;
            val = val + add ;
        }

        return val;
    }

    // adjacent elements product
    static int solAdjacentElm(int[] inputArray){
        int max = inputArray[0] * inputArray[1];

        for(int i = 1; i < inputArray.length; i++){
            if(inputArray[i] * inputArray[i-1] > max) max = inputArray[i] * inputArray[i-1];
        }

        return max;
    }

    // get century
    static int sol(int year){
        System.out.println(year);
        int x = year / 100;
        int y = year % 100;
        if(y >= 1) x = x+1;
        if(y == 0) return x;
        return x;
    }

    // check palindrome
    static boolean solCheckPalindrome(String inputString){

        if(inputString.length() == 1) return true;
        char[] ch = inputString.toCharArray();
        int start = 0;
        int end = inputString.length()-1;

        while (start != end){
            if(end - start == 1){
                if(ch[start] != ch[end]) return false;
                break;
            }
            if(ch[start] == ch[end]){
                start++;
                end--;
            }else {
                return false;
            }
        }
        return true;
    }

    static boolean solution(int[] sequence){
        System.out.println(Arrays.toString(sequence));
        int val = 0;
        int hval = 0;
        int max = sequence[0];
        HashMap<Integer,Integer> nm = new HashMap<>();
        for(int i = 1; i < sequence.length; i++){
            System.out.println(sequence[i]);
            if(nm.containsKey(sequence[i])){
                nm.put(sequence[i], nm.get(sequence[i])+1);
            }else {
                nm.put(sequence[i], 1);
            }
            if(sequence[i] < sequence[i-1]){
                val++;
            }else {
                max = sequence[i];
            }
            System.out.println("**** debug ****************************");
            System.out.println("val " + val);
            System.out.println("hval " +hval);
            System.out.println("contains " + nm.containsKey(sequence[i]));
            System.out.println("get " + nm.get(sequence[i]));
            System.out.println(nm.containsKey(sequence[i]) && nm.get(sequence[i]) > 1);
            System.out.println("**** debug end ****");
            System.out.println("**** Max *****");
            System.out.println(max);
        }
        for(int i = 1; i < sequence.length; i++){
            for(Integer key: nm.keySet()){
                if(sequence[i] < key  ){
                    hval++;
                }
            }
        }

        if(val >= 2 || hval >= 2 ){
            return false;
        }
        System.out.println("val " + val);
        System.out.println("hval " +hval);
        System.out.println("******* final *******");
        System.out.println("**** Max *****");
        System.out.println(max);
        return true;
    }
}
