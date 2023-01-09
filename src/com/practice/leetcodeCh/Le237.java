package leetcodeCh;

public class Le237 {

    Node head;

    class Node{
        int data;
        Node next;
        Node(int val){ this.data = val; }
    }

    void insertNode(int data) {
        if(head == null){
            head = new Node(data);
        }else{
            Node last = head;
            while(last.next != null){
                last = last.next;
            }
            last.next = new Node(data);
        }
    }

    public static void main(String[] args) {

        Le237 le = new Le237();
        le.insertNode(4);
        le.insertNode(64);
        le.insertNode(44);
        le.insertNode(34);
        le.insertNode(24);
        Node test = le.head;

//        while(test != null){
//            System.out.println(test.data);
//            test = test.next;
//        }

//        le.deleteNode(head);

    }

    public void deleteNode(ListNode node){

    }

}
