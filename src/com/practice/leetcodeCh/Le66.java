package leetcodeCh;

import java.math.BigInteger;
import java.util.Arrays;

public class Le66 {

    public static void main(String[] args) {

        int[] digits = {1,2,3};
//        int[] digits = {9};
//        int[] digits = {8, 9};
//        int[] digits = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};

        System.out.println(Arrays.toString(Le66.plusOne(digits)));

    }

    static int[] plusOne(int[] digits){

        int size = digits.length-1;
        int carray = 0;

        if(digits[size] < 9){
            digits[size] += 1;
            return digits;
        }else {
            int sum = 0;
            for(int i = size; i >= 0; i--){
                if(i == size){
                    sum = digits[i] + 1;
                } else {
                    sum = digits[i] + carray;
                }

                carray = 0;
                int car = sum / 10;

                if(car == 0){
                    digits[i] = sum;
                    break;
                }else {
                    digits[i] = 0;
                    carray = 1;
                }
            }
        }
        if(carray == 1){
            int[] newArr = new int[digits.length+1];
            newArr[0] = 1;
            return newArr;
        }
         return digits;
    }

}


/*

digits = [1, 2, 3]

increment the last digit by 1
if last digit is 9 take the carry and add it to the left

carry = 0
currentval = carry + 1;

int x = currentval % 2

499

0

loop through the size
  add to the last index
  if no carray
      break
  else
    add carray to the next index



   select * from x where columnx in ('3', '33', '488')

 */