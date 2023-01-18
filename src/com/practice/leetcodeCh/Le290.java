package leetcodeCh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Le290 {

    public static void main(String[] args) {

        String pattern = "abba";
        String s = "dog cat cat ";

        String pattern1 = "abba";
        String s1 = "dog cat cat fish";

        String pattern2 = "aaaa";
        String s2 = "dog cat cat dog";

        String pattern3 = "abba";
        String s3 = "dog dog dog dog";



        System.out.println(Le290.wordPattern(pattern, s));
        System.out.println(Le290.wordPattern(pattern1, s1));
        System.out.println(Le290.wordPattern(pattern2, s2));
        System.out.println(Le290.wordPattern(pattern3, s3));
    }

    static boolean wordPattern(String pattern, String s){
        HashMap<Character, String > hm = new HashMap<>();
        String[] list = s.split(" ");
        if(pattern.length() != list.length){
            return false;
        }
        for(int i = 0; i < pattern.length(); i++){
            if(!hm.containsKey(pattern.charAt(i))){
                if(hm.containsValue(list[i])){
                    return false;
                }
                hm.put(pattern.charAt(i), list[i]);
            }else {
                if(!hm.get(pattern.charAt(i)).equals(list[i])){
                    return false;
                }
            }
        }

        return true;
    }

}
