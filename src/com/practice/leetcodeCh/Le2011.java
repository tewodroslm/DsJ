package leetcodeCh;

public class Le2011 {

    public static void main(String[] args) {

        Le2011 l = new Le2011();

        String list[] = {"--X", "X++", "X++" };
        String list1[] = {"++X", "++X", "X++"};
        String list2[] = {"X++", "++X", "--X", "X--"};

        System.out.println(l.finalValueAfterOperations(list));
        System.out.println(l.finalValueAfterOperations(list1));
        System.out.println(l.finalValueAfterOperations(list2));

     }

     int finalValueAfterOperations(String[] operations){

        int x = 0;

        for (String s : operations){
            if(s.charAt(0) == '-' || s.charAt(s.length()-1) == '-'){
                x--;
            }else {
                x++;
            }
        }

        return x;

    }

}
