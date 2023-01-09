package leetcodeCh;

import java.util.Arrays;

public class Le14 {

    public static void main(String[] args) {

        String[] strs = {"flower","flow","flowight", "flowxx"};
        String[] strs1 = {"dog","racecar","car"};
        String[] str2 = {"aa", "aa"};
        String[] str4 = {"flower","flower","flower","flower"};



        System.out.println(Le14.longestCommonPrefix(strs));
        System.out.println(Le14.longestCommonPrefix(strs1));
        System.out.println(Le14.longestCommonPrefix(str2));
        System.out.println(Le14.longestCommonPrefix(str4));

    }

    public static String longestCommonPrefix(String[] strs){
        System.out.println("***** In ****");
        System.out.println(Arrays.toString(strs));
        String solution = "";
        String first = strs[0];
        if(strs.length == 1){
            return strs[0];
        }

        for(int i = 1; i < strs.length; i++){
            int hold = strs[i].length() < first.length() ? strs[i].length() : first.length();
//            System.out.println(hold);
            for(int j = 0; j < hold; j++){
                if(strs[i] == first){
                    solution = strs[i];
                }else{
                    if(first.charAt(j) == strs[i].charAt(j)){
                        if(!solution.contains(String.valueOf(strs[i].charAt(j)))) {
                            solution += first.charAt(j);
                        }
                    }else if(first.charAt(j) != strs[i].charAt(j)){
                        return solution.substring(0, j);
                    }else{
                        return solution;
                    }
                }

            }
        }
        System.out.println("Solution : " + solution);
        return solution;

//        int size=strs.length;
//        if(size==0)
//        {
//            return "";
//        }
//        if(size==1)
//        {
//            return strs[0];
//        }
//        Arrays.sort(strs);
//        int end=Math.min(strs[0].length(),strs[size-1].length());
//        System.out.println(end);
//        int i=0;
//        while(i<end && strs[0].charAt(i) == strs[size-1].charAt(i)) {
//            i++;
//        }
//        String pre=strs[0].substring(0,i);
//        return pre;
    }

}


// Longest Common Prefix

//                        if(strs[i] != solution){
//                            if(!solution.contains(String.valueOf(strs[i].charAt(j)))){
//                                solution += first.charAt(j);
//                            }
//                        }
//                        if(!solution.contains(String.valueOf(strs[i].charAt(j)))){
//                                solution += first.charAt(j);
//                                }