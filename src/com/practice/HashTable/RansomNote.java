package com.practice.HashTable;

/*
    Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

    Each letter in magazine can only be used once in ransomNote.

    Example 1:

    Input: ransomNote = "a", magazine = "b"
    Output: false

    Input: ransomNote = "aa", magazine = "ab"
    Output: false

    Input: ransomNote = "aa", magazine = "aab"
    Output: true
 */

import java.util.HashMap;

public class RansomNote {

    public static void main(String[] args){

        RansomNote ransomNote = new RansomNote();

        String rNote = "fihjjjjei";
        String mNote = "hjibagacbhadfaefdjaeaebgi";

        System.out.println(ransomNote.canConstruct(rNote, mNote));

    }

    public boolean canConstruct(String ransomNote, String magazine){

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        map1 = myMap(map1, ransomNote);
        map2 = myMap(map2, magazine);

        boolean y = false;
        for(char i: map1.keySet()){
            if(map1.containsKey(i) && map2.containsKey(i)){
                if(map2.get(i) >= map1.get(i)){
                    y = true;
                }
                else {
                    y = false;
                    return y;
                }
            }else{
                y = false;
                return y;
            }
        }
        return y;
    }

    private HashMap<Character, Integer> myMap(HashMap<Character, Integer> map, String s){
        for(int i=0; i < s.length(); i++){
            char x = s.charAt(i);
            if(map.containsKey(x))
                map.put(x, map.get(x) + 1);
            else
                map.put(x, 1);
        }
        return map;
    }
}



         /*
            ransomNote = "acdd"  magazine = "acjhadud"
            HashMap x = {a:1, c:1, d:2}
            for(char i: ransomNote)
                if x.containsKey(x)
                    x.put(x, x.get(x)+1)
                 else
                    x.put(x, 1)
             HashMap y = {a:1, c:1, d:2}
            for i in magazine
                char y = magazine.charAt(i)
                if y.containsKey(x)
                    y.put(x, x.get(x)+1)
                 else
                    y.put(x, 1)
            bool holder = false;
             for(char i: x.keySet())
                if(x.get(i) == y.get(i))
                    holder = true
                else
                    holder = false
                    return
         */





















