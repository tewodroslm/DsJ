package leetcodeCh;

public class Le328 {

    ListNode head;

    class ListNode{
        int val;
        ListNode next;

        ListNode(){}
        ListNode(int val) { this.val = val;}
        ListNode(int val, ListNode ln) { this.val = val; this.next = ln;}

    }

    void insertNode(int val){
        if(head == null){
            head = new ListNode(val);
        }else{
            ListNode tail = head;
            while(tail.next != null){
                tail = tail.next;
            }
            tail.next = new ListNode(val);
        }
    }

    public static void main(String[] args) {
        Le328 l = new Le328();
        l.insertNode(1);
        l.insertNode(2);
        l.insertNode(3);
        l.insertNode(4);
        l.insertNode(5);

        ListNode oddV = oddEvenList(l.head);

    }

    public static ListNode oddEvenList(ListNode head){
        System.out.println("--- inside of odd event list ---");
        ListNode even;
        ListNode odd = head;

        ListNode temp = head;

        while(temp.next.next != null){
            odd.next = temp.next.next;
            System.out.println(odd.next.val);
            temp = temp.next.next;
            System.out.println(temp.val);
        }

        int sum = 0;
        sum = 17/10;
        System.out.println("Sum -> " + sum);

        while(odd != null){
//            System.out.println(odd.val);
//            odd = odd.next;
        }


        return temp;
    }
}






















