package leetcodeCh;

public class Le21 {

    Node head;

    class Node{
        int val;
        Node next;

        Node(){}
        Node(int val){ this.val = val; }
        Node(int val, Node m){
            this.val = val;
            this.next = m;
        }
    }
    void insertNode(int v){
        Node n = new Node(v);

        if(head == null){
            head = n;
        }else{
            Node last = head;
            while(last.next != null){
                last = last.next;
            }
            last.next = n;
        }

    }

    public static void main(String[] args) {
        Le21 l1 = new Le21();
        l1.insertNode(31);
        l1.insertNode(311);
        l1.insertNode(312);
        l1.insertNode(313);
        l1.insertNode(314);

        Le21 l = new Le21();
        l.insertNode(1);
        l.insertNode(11);
        l.insertNode(12);
        l.insertNode(13);
        l.insertNode(14);

//        Node temp = l1.head;
//        while(temp != null){
//            System.out.println(temp.val);
//            temp = temp.next;
//        }
//
//        System.out.println("\n checking value of head");
//        System.out.println(l1.head.val);
//        System.out.println(l1.head.next.val);
//
//        System.out.println("\n checking value of temp!");
//        System.out.println(temp.val);

//        System.out.println(new Le21().mergeTwoLists(l.head, l1.head));
//        System.out.println("**********");
//        Node lv = new Le21().mergeTwoLists1(l.head, l1.head);
//        while(lv != null){
//            System.out.println(lv.val);
//            lv = lv.next;
//        }

    }


    Node mergeTwoLists(Node list1, Node list2){
        System.out.println("Inside Merge method");
//        while(list1 != null){
//            System.out.print(list1.val+ " - > " );
//            list1 = list1.next;
//        }
//
//        System.out.println("\n");
//        while(list2 != null){
//            System.out.print(list2.val+ " -> " );
//            list2 = list2.next;
//        }
        System.out.println("\nMerge to lists");

        Node hs = new Node(0);
        Node tail = hs;

        while(true){
            if(list1 == null){
                tail.next = list2;
                break;
            }
            if(list2 == null){
                tail.next = list1;
                break;
            }

            if(list1.val <= list2.val){
                tail.next = list1;
                list1 = list1.next;
            }else{
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        while(hs != null){
            System.out.print(hs.val+ " - > " );
            hs = hs.next;
        }

        return hs.next;
    }

    // using Recursion
    Node mergeTwoLists1(Node list1, Node list2){
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;

        if(list1.val < list2.val){
            list1.next = mergeTwoLists1(list1.next, list2);
            return list1;
        }
        else {
            list2.next = mergeTwoLists1(list1, list2.next);
            return list2;
        }
    }
}


















