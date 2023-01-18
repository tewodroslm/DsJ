package leetcodeCh;

import java.util.ArrayList;
import java.util.List;

// Medium
public class Le438 {

    public static void main(String[] args) {

        String s = "cbaebabacd";
        String p = "abc";

        String s1 = "abab";
        String p1 = "ab";

        String s2 = "baa";
        String p2 = "aa";

        String s3 = "ababababab";
        String p3 = "aab";

        String s4 = "af";
        String p4 = "be";

        System.out.println(Le438.findAnagrams(s, p));
        System.out.println(Le438.findAnagrams(s1, p1));
        System.out.println(Le438.findAnagrams(s2, p2));
        System.out.println(Le438.findAnagrams(s3, p3));
        System.out.println(Le438.findAnagrams(s4, p4));


    }

    static List<Integer> findAnagrams(String s, String p){

        List<Integer> res = new ArrayList<>();

        int wind = p.length();
        int slen = s.length();

        for(int i = 0; i < slen-wind+1; i++){
            boolean con = true;
            for(int j = 0; j < wind; j++){
                if(!s.substring(i, i+wind).contains(String.valueOf(p.charAt(j)))
                       ){
                        con = false;
                }else if(!p.contains(String.valueOf(s.charAt(i)))){
                    con = false;
                }
             }
            boolean con1 = check(s.substring(i, i+wind), p);

            if(con1 && con) res.add(i);
        }

        return res;
    }

    static boolean check(String s1, String s2){

        char sc[] = s1.toCharArray();
        char sc2[] = s2.toCharArray();
        int on = 0;
        int on1 = 0;
        for(int i = 0 ; i < sc.length; i++){
            on += sc[i];
        }
        for(int i = 0 ; i < sc2.length; i++){
            on1 += sc2[i];
        }
        if(on != on1) return false;
        return true;
    }

}
