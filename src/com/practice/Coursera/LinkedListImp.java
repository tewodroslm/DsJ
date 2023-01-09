package Coursera;

public class LinkedListImp {

//    Node head;

//    class Node {
//        int val;
//        Node next;
//
//        Node(int val) { this.val = val;}
//    }
//
//    void insertNode(int val){
//        Node temp = head;
//        if(temp == null){
//            head = new Node(val);
//        } else {
//            Node last = head;
//            while(last.next != null){
//                last = last.next;
//            }
//            last.next = new Node(val);
//        }
//    }

    Node head;

    class Node {
        int val;
        Node next;
        Node(int val) { this.val = val; }

    }

    void insertNode(int val){
        if(head == null){
            head = new Node(val);
        }else {
            Node last = head;
            while(last.next != null){
                last = last.next;
            }
            last.next = new Node(val);
        }

    }

    public static void main(String[] args) {
        LinkedListImp ll = new LinkedListImp();
//        ll.insertNode(3);
//        ll.insertNode(32);
//        ll.insertNode(33);
//        ll.insertNode(34);
//        Node check = ll.head;
//        while(check != null){
//            System.out.println(check.val);
//            check = check.next;
//        }


    }

}
