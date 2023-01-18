package leetcodeCh;

public class Le2 {

    ListNode head;

    class ListNode {
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val) {
            this.val = val;
        }
    }

    void insertLN(int val){
        if(head == null) head = new ListNode(val);
        else {
            ListNode last = head;
            while(last.next != null){
                last = last.next;
            }
            last.next = new ListNode(val);
        }
    }

    public static void main(String[] args) {

        Le2 lt = new Le2();
        lt.insertLN(1);
        lt.insertLN(2);
        lt.insertLN(3);
        lt.insertLN(4);
        lt.insertLN(7);
        lt.insertLN(6);
//        lt.insertLN(9);
//        lt.insertLN(9);
//        lt.insertLN(9);
//        lt.insertLN(9);
//        lt.insertLN(9);
//        lt.insertLN(9);
//        lt.insertLN(9);


        Le2 lt1 = new Le2();
        lt1.insertLN(9);    // 1
        lt1.insertLN(2);    // 2
        lt1.insertLN(5);    // 3
        lt1.insertLN(4);    // 4
        lt1.insertLN(7);    // 7
        lt1.insertLN(7);    // 6
        lt1.insertLN(0);    //
                                //
//        lt1.insertLN(9);    // 4
//        lt1.insertLN(9);    // 7
//        lt1.insertLN(9);    // 6
//        lt1.insertLN(9);


        ListNode res = lt.addTwoNumbers(lt.head, lt1.head);
        while(res != null){
            System.out.println(res.val);
            res = res.next;
        }

    }

    ListNode addTwoNumbers(ListNode l1, ListNode l2){

        ListNode temp1 = l1;
        ListNode temp2 = l2;

        ListNode result = new ListNode(-1);
        int carry = 0;


        ListNode last = result;



        while(temp1 != null || temp2 != null){
             int addi = 0;
            if(temp1 == null) addi = 0 + temp2.val + carry;
            if(temp2 == null) addi = temp1.val + 0 + carry;
            if(temp1 != null && temp2 != null) addi = temp1.val + temp2.val + carry;


            while(last.next != null){
                 last = last.next;
            }

            if(addi > 9 ) {
                carry = 1;
                 last.next = new ListNode(addi%10);
                System.out.println("There carry " + carry);
            } else {
                 last.next = new ListNode(addi);
                carry = 0;
            }
            if(temp1 != null)  temp1 = temp1.next;

            if(temp2 != null)    temp2 = temp2.next;

        }

        ListNode tl = result;

        if(carry == 1){
            while(tl.next != null){
                tl = tl.next;
            }
            tl.next = new ListNode(carry);
        }
        return result;
    }

}

/*
Output
[8,9,9,9,0,0,0]
Expected
[8,9,9,9,0,0,0,1]
 */











