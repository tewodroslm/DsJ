package Coursera;

public class BinaryTree {

//    private TreeNode root;
//
//    class TreeNode{
//        private int data;
//        private TreeNode right;
//        private TreeNode left;
//
//        TreeNode(int data){ this.data = data; }
//
//        TreeNode(TreeNode right, TreeNode left){
//            this.right = right;
//            this.left = left;
//        }
//
//
//
//        void printInOrder() {
//            if(left != null) {
//                left.printInOrder();
//            }
//            System.out.println(data);
//            if(right != null) {
//                right.printInOrder();
//            }
//        }
//
//    }

//    void createBinaryTree(){
//       TreeNode first = new TreeNode(1);
//       TreeNode second = new TreeNode(2);
//       TreeNode third = new TreeNode(3);
//       TreeNode fourth = new TreeNode(4);
//       TreeNode fifth = new TreeNode(5);
//
//       first.right = second;
//       first.left = third;
//       root = first;
//
//       second.left = fourth;
//       second.right = fifth;
//
//    }

    Node root;

    static class Node{
        int val;
        Node right;
        Node left;
        Node(){}
        Node(int val) {
            this.val = val;
            this.right = this.left = null;
        }

    }

    Node insertNode(Node node, int val){
        System.out.println("Check insertNode Node");
        System.out.println(node);
        System.out.println("Val is " + val);
        System.out.println("--------------");
        if(node == null) {
            node = new Node(val);
            System.out.println(node.hashCode());
            return node;
        }else{
            if(node.val < val){
                node.right = insertNode(node.right, val);
            }else if(node.val > val) {
                node.left = insertNode(node.left, val);
            }else {
                return node;
            }
        }
        return node;
    }

    void printTree(Node root){
        System.out.println("INSIDE PRINT TREE");
        if(root != null) {
            printTree(root.left);

            System.out.println(root.val);
            printTree(root.right);

        }

    }

    void add(int value){
//        System.out.println("ROOT INSIDE OF ADD "+ root);
       root = insertNode(root, value);
        System.out.println("After Adding value of " + value + " Root is " + root.val);
    }

    void insert(Node node, int value){
        System.out.println("Insert");
//        if(node == null){
//            System.out.println("Node is empty");
//            node = new Node(val);
//            System.out.println(node.val);
//            System.out.println(node.hashCode());
////            return node;
//        }else{
//            System.out.println("Node is not empty");
//            if(node.val < val){
//                 insert(node.right, val);
//            }else {
//                 insert(node.left, val);
//            }
//        }
//        if (value < node.val) {
//            if (node.left != null) {
//                insert(node.left, value);
//            } else {
//                System.out.println(" Inserted " + value + " to left of " + node.val);
//                node.left = new Node(value);
//            }
//        } else if (value > node.val) {
//            if (node.right != null) {
//                insert(node.right, value);
//            } else {
//                System.out.println("  Inserted " + value + " to right of "
//                        + node.val);
//                node.right = new Node(value);
//            }
//        }
        if(node == null){
            System.out.println("Node is empty");
            node = new Node(value);
            System.out.println(node.val);
            System.out.println(node.hashCode());
//            return node;
        }else {
            if (value < node.val) {
                if (node.left != null) {
                    insert(node.left, value);
                } else {
                    System.out.println(" Inserted " + value + " to left of " + node.val);
                    node.left = new Node(value);
                }
            } else if (value > node.val) {
                if (node.right != null) {
                    insert(node.right, value);
                } else {
                    System.out.println("  Inserted " + value + " to right of "
                            + node.val);
                    node.right = new Node(value);
                }
            }
        }
    }

    void traverseInOrder(Node node){
         if(node != null) {
            traverseInOrder(node.left);
            System.out.println(node.val);
            traverseInOrder(node.right);
        }
    }

    void addTest(int value){
        insert(root, value);
    }


    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();
        Node rooI = new Node(3);
        // Print tree
//        TreeNode last = bt.root;
//        while(last.right != null || last.left != null){
//            System.out.println(last.data);
//            last = last.left;
//            last = last.right;
//
//        }

        bt.add(5);
        bt.add(15);
        bt.add(25);
        bt.add(35);
        bt.add(45);
//        bt.root = new Node(3);
//        System.out.println("Before ALL");
//        System.out.println(bt.root);
//        System.out.println("BE");
////        bt.insert(bt.root, 5);
////        bt.insert(bt.root, 15);
////        bt.insert(bt.root, 25);
//        bt.addTest( 5);
//        bt.addTest( 55);
//        bt.addTest( 95);
////        bt.insert(rooI, 35);
////        bt.insert(rooI, 45);
        System.out.println("**** after insert ***");
        System.out.println(bt.root.val);
        System.out.println("**** end ** ");


//        bt.printTree(bt.root);
        System.out.println("Inside Traverse In Order *");
        bt.traverseInOrder(bt.root);

    }

//    int maxDepth(TreeNode root){
//
//
//    }
}















