package com.practice.String;

import java.util.*;

public class ValidAnagram {

    public static void main(String[] args){

        String s = "wedrjcp";
        String t = "pcwejdr";

        ValidAnagram validAnagram = new ValidAnagram();
        System.out.println(validAnagram.isAnagram(s,t));

    }

    public boolean isAnagram(String s, String t){

        s  = s.replaceAll("\\s", "");
        t  = t.replaceAll("\\s", "");

        int sLength = s.length();

        HashMap<Character, ArrayList<Integer>> map1 ;
        HashMap<Character, ArrayList<Integer>> map2 ;

        List<Character> chrs = new ArrayList<>();

        for(int i=0; i<sLength; i++){
            char c1 = s.charAt(i);
            chrs.add(c1);
        }

        map1 = get1(s);
        map2 = get1(t);

        boolean x = false;
        if(map1.size() == map2.size()){
            for(int i = 0 ; i < chrs.size(); i++){
                if(map1.containsKey(chrs.get(i)) && map2.containsKey(chrs.get(i))){
                    if(map1.get(chrs.get(i)).size() == map2.get(chrs.get(i)).size()){
                        x = true;
                    }else {
                        x = false;
                    }
                }else{
                    x = false;
                    return x;
                }

            }
        }

        System.out.println(map1);
        System.out.println(map2);

        return x;
    }

    public HashMap<Character, ArrayList<Integer>> get1(String word){
        HashMap<Character, ArrayList<Integer>> map = new HashMap<>();

        for(int i=0; i < word.length(); i++){

            char ch = word.charAt(i);

            ArrayList<Integer> indexes = new ArrayList<>();

            if(map.containsKey(ch)){
                indexes.addAll(map.get(ch));
            }

            indexes.add(i);

            map.put(ch, indexes);

        }

        return map;

    }

}
