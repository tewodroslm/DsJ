package leetcodeCh;

import java.util.List;

class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}

public class Le876 {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        ListNode listNode6 = new ListNode(6);


        listNode1.next = listNode5;
        listNode1.next.next = listNode;
        listNode1.next.next.next = listNode3;
        listNode1.next.next.next.next = listNode4;
//        listNode1.next.next.next.next.next = listNode6;

        System.out.println("*** returned val ****");
        System.out.println(Le876.middleNode(listNode1).next);
//        System.out.println(Le876.llistLenRecursive(listNode1));
    }

    public static int llistLenRecursive(ListNode node){
        if(node == null){
            return 0;
        }else{
            return 1 + llistLenRecursive(node.next);
        }
    }

    public static ListNode middleNode(ListNode head) {

        ListNode listN = head;
        int size = 1;
        while(listN != null){
            size += 1;
            System.out.println(listN.val);
            listN = listN.next;
        }
        int s = size%2 == 0 ? size/2 : (size/2)+1;
        ListNode newNode = new ListNode();
        ListNode ln = head;
        int m = 1;
        while(ln != null){
            if(m == s){
                return ln;
            }else{
                ln = ln.next;
                m+=1;
            }
        }

        return ln;
    }
}

/**
 * Given the head of a singly linked list, return the middle node of the linked list.
 *
 * If there are two middle nodes, return the second middle node.
 */