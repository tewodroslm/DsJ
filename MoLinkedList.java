import javax.sound.sampled.SourceDataLine;

public class MoLinkedList {
    public static void main(String[] args){
        System.out.println("Hello test");
        ListNode li = new ListNode();
        li = new ListNode(1,new ListNode(2));
        li.next = new ListNode(2, new ListNode(3));
        li.next = new ListNode(3, new ListNode(4));
        li.next = new ListNode(4, new ListNode(5));
        li.next = new ListNode(5);
        System.out.println(li.next.val);
    }
}

class ListNode {
    int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}