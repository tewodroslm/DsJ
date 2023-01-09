package leetcodeCh;

import java.lang.reflect.Array;
import java.util.*;

public class Le1544 {
    static String ho = "";
    public static void main(String[] args) {
//        char x  = 'B';
//        char y = 'b';

//        String s = "abBAcC";
//        String l = "leEeetcode";
//        String m = "jJioOmSst";

//        System.out.println(m);
//        System.out.println(makeStringGreat(m));

//        System.out.println("********* Palindrom *********");
//        System.out.println(solution("hlbeeykoqqqqokyeeblh"));

        System.out.println("******* almost increasing sequence **********");
//        int[] seq= new int[]{10, 1, 2, 3, 4, 5};
//        int[] seq= new int[]{1, 3, 2};
//        int[] seq= new int[]{0, -2, 5, 6};
//        int[] seq= new int[]{1, 3, 2, 1};
//        int[] seq= new int[]{1, 1, 2, 3, 4, 4};
//        int[] seq = new int[]{1, 2, 1, 2};
//        int[] seq = new int[]{1,1};
//        int[] seq = new int[]{1, 2, 3, 4, 3, 6};
//        int[] seq = new int[]{10, 1, 2, 3, 4, 5, 6, 1};
//        int[] seq = new int[]{3, 6, 5, 8, 10, 20, 15};
//        int[] seq = new int[]{3, 5, 67, 98, 3};
//        int[] seq = new int[]{1,1};
//        int[] seq = new int[]{1,-1};
//        int[] seq = new int[]{1};
        int[] seq = new int[]{0,1,1};

//        int[] seq = new int[]{3, 5, 67, 98, 3};

        System.out.println(solutionSequ(seq));

    }

    private static String makeStringGreat(String s){
        char[] arr = s.toCharArray();
        int n = arr.length;
        LinkedList<Character> list = new LinkedList<>();
        for(int i = 0; i < n; i++){
            if(!list.isEmpty()){
                if(Math.abs(list.getLast() - arr[i]) == 'a' - 'A'){
                    list.removeLast();
                    continue;
                }
            }
            if(i + 1 != n && Math.abs(arr[i + 1] - arr[i]) == 'a' - 'A') i++;
            else list.add(arr[i]);
        }
        StringBuilder sb = new StringBuilder();
        while(!list.isEmpty()){
            sb.append(list.removeFirst());
        }
        return sb.toString();
    }

    static boolean solution(String inputString) {
        char[] is = inputString.toCharArray();

        if(is.length == 1){
            return true;
        }

        int start = 0;
        int end = is.length-1;

        while(start <= is.length -1){
            System.out.println(start);
            System.out.println(end);

            if(is[start] != is[end]){
                return false;
            }
            start += 1;
            end -= 1;
        }

        return true;

    }

    /**
     * Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing sequence by removing no more than one element from the array.
     *
     * Note: sequence a0, a1, ..., an is considered to be a strictly increasing if a0 < a1 < ... < an. Sequence containing only one element is also considered to be strictly increasing.
     *
     * Example
     *
     * For sequence = [1, 3, 2, 1], the output should be
     * solution(sequence) = false.
     *
     * There is no one element in this array that can be removed in order to get a strictly increasing sequence.
     *
     * For sequence = [1, 3, 2], the output should be
     * solution(sequence) = true.
     *
     * You can remove 3 from the array to get the strictly increasing sequence [1, 2]. Alternately, you can remove 2 to get the strictly increasing sequence [1, 3].
     * @param sequence
     * @return
     */
    // almostIncreasing sequence

    static boolean solutionSequ(int[] sequence) {
        System.out.println(Arrays.toString(sequence));
        boolean hold = true;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < sequence.length ; i ++){
            list.add(sequence[i]);
        }
        int m = 0;
        int siz = list.size();
        if(list.size() == 0){
            return false;
        }
        if(list.size() == 2){
            if(list.get(0) == list.get(1)){
                return true;
            }else if(list.get(1) > list.get(0)){
                return true;
            }else{
                return false;
            }
        }
        System.out.println("***tes");
        if(list.size() == 3){
            for(int i = 0; i < list.size()-1; i++){
                if(list.get(i+1) >= list.get(i)){
                    return true;
                }
            }
        }
        for(int i = 0; i < list.size(); i++){
            if(i != list.size()-1 && i != 0 ){
                if((list.get(i) > list.get(i+1) && list.get(i) > list.get(i-1))
                        || list.get(i) < list.get(i+1) && list.get(i) < list.get(i-1)){
                    if(list.get(i+1) != list.get(i-1) ){
                        if(list.get(i+1) < list.get(i-1)){
                            list.remove(i+1);
                            m+=1;
                        }
                        else{
                            list.remove(i);
                            m += 1;
                        }
                    }

                }
            }else if(i != list.size()-1){
                if(list.get(i) > list.get(i+1) && list.get(i) > list.get(i+2)){
                    list.remove(i);
                    m += 1;
                }else if(list.get(i) == list.get(i+1)){
                    list.remove(i);
                }
            }
        }

        System.out.println(list);
        for(int i = 0; i < list.size()-1; i++){
            if(list.get(i) == list.get(i+1) || list.get(i+1) < list.get(i) || m > 1){
                System.out.println("**false");
                hold = false;
            }
        }
        if(list.size() == 1){
            hold = true;
        }
        return hold;
    }

}















