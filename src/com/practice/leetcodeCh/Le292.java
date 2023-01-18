package leetcodeCh;

public class Le292 {

    public static void main(String[] args) {
        int n = 4;

        int n1 = 1;
        int n2 = 2;

        int n3 = 5;
        int n4 = 9;
        int n5 = 8;

        System.out.println(new Le292().canWinNim(n));
        System.out.println(new Le292().canWinNim(n1));
        System.out.println(new Le292().canWinNim(n2));
        System.out.println(new Le292().canWinNim(n3));
        System.out.println(new Le292().canWinNim(n4));
        System.out.println(new Le292().canWinNim(n5));
    }

    boolean canWinNim(int n){
        /*
                      4
             3         2           1

              2
          2

          my base cases are 3, 2 and 1

        */

        System.out.println("Call " + n);
        if(n % 4 == 0){
            return false;
        }

        return true;
    }

}
