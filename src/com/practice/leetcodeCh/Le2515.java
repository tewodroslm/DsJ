package leetcodeCh;

public class Le2515 {

    public static void main(String[] args) {
        Le2515 l = new Le2515();
        String list[] = { "hello", "i", "am" ,"leetcode", "hello" };
        String list1[] = { "a", "b", "leetcode" };
        String list2[] = { "i", "eat", "leetcode" };

        System.out.println(l.closetTarget(list, "hello", 1));
        System.out.println(l.closetTarget(list1, "leetcode", 0));
        System.out.println(l.closetTarget(list2, "ate", 0));

    }

    int closetTarget(String[] words, String target, int startIndex){
        int result = 0;



        return result;
    }

}
