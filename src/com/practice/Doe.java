package com.practice;

import java.util.HashMap;

public class Doe {

    public static void main(String args[]){

        String ransomNote = "jko";
        String magazine = "rrrrr";
        System.out.println(new Doe().canConstruct(ransomNote, magazine));
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        char[] ran = ransomNote.toCharArray();
        char[] mag = magazine.toCharArray();

        HashMap<Character, Integer> hr = new HashMap<>();
        HashMap<Character, Integer> mr = new HashMap<>();

        for(char i: ran){
            if(hr.containsKey(i)){
                hr.put(i, hr.get(i)+1);
            }else{
                hr.put(i, 1);
            }
        }

        for(char i: mag){
            if(mr.containsKey(i)){
                mr.put(i, mr.get(i)+1);
            }else{
                mr.put(i, 1);
            }
        }

        System.out.println(hr);
        System.out.println(mr);
        boolean sol = true;
        for(char i: hr.keySet()){
            if(!mr.containsKey(i) || (mr.get(i)<hr.get(i))){
                sol = false;
            }
        }

        return sol;
    }

}

/*
383. Ransom Note

Share
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.



Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true
 */