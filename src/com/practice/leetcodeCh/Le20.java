package leetcodeCh;

import java.util.HashMap;
import java.util.Stack;

public class Le20 {

    public static void main(String[] args) {

        String s0 = "()";
        String s1 = "()[]{}";
        String s2 = "(]";
        String s3 = "){";
        String s4 = "<>";


        System.out.println(Le20.isValid(s0));
        System.out.println(Le20.isValid(s1));
        System.out.println(Le20.isValid(s2));
        System.out.println(Le20.isValid(s3));
        System.out.println(Le20.isValid(s4));

    }

    private static boolean isValid(String s){

        HashMap<Character, Integer> val = new HashMap<>(){{
            put('(', 1);
            put(')', 2);
            put('{', 4);
            put('}', 5);
            put('[', 7);
            put(']', 8);
            put('<', 10);
            put('>', 11);
        }};

        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));

        int start = 0;
        int end = s.length()-1;
        int size = s.length()-1;
        System.out.println("Start -> "+start + " end -> " + end + " Size -> " + size);
        System.out.println(s.charAt(end));
        System.out.println(val.get(s.charAt(end)));

        for(int i = 1; i <= size; i++){
            if(!stack.isEmpty()){
                if(val.get(s.charAt(i)) - val.get(stack.peek()) == 1){
                    stack.pop();
                }else {
                    stack.push(s.charAt(i));
                }
            } else {
                stack.push(s.charAt(i));
            }
        }
        if(stack.isEmpty())
            return true;
        return false;
    }

}

// Valid Parentheses







































