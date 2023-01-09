package leetcodeCh;

import java.util.Locale;

public class Le125 {

    public static void main(String[] args) {
        Le125 l = new Le125();

        String s = "A man, a plan, a canal: Panama";
        String s1 =  "race a car";

        String s2 = " ";
        String s3 = "0P";

//        String m1 = "a";
//        String m2 = "a";
//
//        System.out.println("M1 == M2 "+ m1.equals(m2));

        System.out.println(l.isPalindrome(s));
        System.out.println(l.isPalindrome(s1));
        System.out.println(l.isPalindrome(s2));
        System.out.println(l.isPalindrome(s3));


    }

    boolean isPalindrome(String s) {
        System.out.println(s);
        char[] hold = s.toCharArray();
        int start = 0;
        int end = hold.length-1;

        while(start <= end){

            if(!(hold[start] >= 'A' && hold[start] <= 'Z') && !(hold[start] >= 'a' && hold[start] <= 'z') &&
                    !(hold[start] >= '0'  && hold[start] <= '9')) {
                start++;
                continue;
            }
            if(!(hold[end] >= 'A' && hold[end] <= 'Z') && !(hold[end] >= 'a' && hold[end] <= 'z') &&
                    !(hold[end] >= '0'  && hold[end] <= '9')) {
                end--;
                continue;
            }

            String s1 = String.valueOf(hold[start]).toLowerCase();

            String s2 = String.valueOf(hold[end]).toLowerCase();


            if(!s1.equals(s2)){
                 return false;
            }
            start++;
            end--;
        }

        return true;
    }

}





















