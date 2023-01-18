package Coursera;

public class BitWise {

    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        System.out.println("a&b = " + (a & b));
        System.out.println("a|b = " + (a | b));

        // bitwise xor
        // 0101 ^ 0111=0010 = 2
        System.out.println("a^b = " + (a ^ b));

        // bitwise not
        // ~00000000 00000000 00000000 00000101=11111111 11111111 11111111 11111010
        // will give 2's complement (32 bit) of 5 = -6
        System.out.println("~a = " + (~a));

        // can also be combined with
        // assignment operator to provide shorthand
        // assignment
        // a=a&b
        a &= b;
        System.out.println("a= " + a);
    }


}

/**
 * Bitwise operators -> are used to performing the manipulation of individual bits of a
 *                      number.
 * They can be used with any integral type(char, short, int,etc)
 * They are used when performing update and query operation of the binary indexed trees.
 *
 * OR (|)
 *
 *   eg a = 5 = 0101
 *      b = 7 = 0111
 *
 *      0101
 *    | 0111
 *    ------
 *      0111 = 7
 *
 * AND (&)
 *
 *    eg a = 5, b = 7
 *      0101
 *    & 0111
 *      ----
 *      0101 = 5
 *
 * XOR (^)   -> if bits are different it gives 1 , else 0
 *
 *    eg a = 5, b = 7
 *      0101
 *    ^ 0111
 *      ----
 *      0010 = 2
 *
 *
 * Complement (~)  -> is a unary operator, it makes every 0 to 1 and 1 to 0
 *
 *    eg a = 5,
 *     ~ 0101
 *       ----
 *       1010 = 10
 *
 *
 * =======
 *
 *  Shift Operators in Java
 *
 *     -> bit manipulation on data by shifting the bits
 *        of its first operand right or left,
 *
 *  Signed Left Shift   <<
 *    eg 2   0010  -->    1000    which is 8
 *
 *  Signed Right Shift
 *    eg 8   1000  -->    0010    which is 2
 *
 *  Unsigned Right Shift and Left Shift
 *    eg ...
 */
