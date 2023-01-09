package leetcodeCh;

public class Le83 {
    ListNode head;
    class ListNode {
        int val;

        ListNode next;
        ListNode() {}

        ListNode(int val) { this.val = val;}
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }

    void insertNode(int val) {
        if(head == null){
            head = new ListNode(val);
        }else {
            ListNode last = head;
            while(last.next != null){
                last = last.next;
            }
            last.next = new ListNode(val);
        }
    }

    public static void main(String[] args) {
        Le83 l = new Le83();

        l.insertNode(1);
        l.insertNode(1);
        l.insertNode(2);
        l.insertNode(3);
        l.insertNode(3);

//        System.out.println(l.deleteDuplicates(l.head).val);

        Le83.ListNode lm = l.deleteDuplicates(l.head);
        while (lm != null){
            System.out.println(lm.val);
            lm = lm.next;
        }

    }

    ListNode deleteDuplicates(ListNode head){

        ListNode lm = head;
        ListNode test = head;
        while (lm != null){
            System.out.println(lm.val);
            if(lm.val == lm.next.val){
                lm.next = lm.next.next;
            }else{
                lm = lm.next;
            }

        }

        return lm;
    }

}
