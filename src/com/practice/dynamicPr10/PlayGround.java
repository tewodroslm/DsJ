package dynamicPr10;

import java.util.*;
import java.util.stream.Collectors;

public class PlayGround {

    static HashMap<Integer, Boolean> hm = new HashMap<>();

    public static void main(String[] args) {
//        hm.clear();
//        int[] list = {4,2};
//        int[] list1 = {1,2,3};
//        int[] list3 = {2, 3, 5};
//        int[] list4 = {7 , 14};
//        System.out.println(PlayGround.canSum(list, list.length, 9));
//
//        hm.clear();
//        System.out.println(PlayGround.canSum(list1, list1.length, 9));
//
//        hm.clear();
//        System.out.println(PlayGround.canSum(list3, list3.length, 8));
//
//        hm.clear();
//        System.out.println(PlayGround.canSum(list4, list4.length, 300));
//
//        System.out.println(hm);


        // BFS
//        Vertex<Integer> v0 = new Vertex<>(0);
//        Vertex<Integer> v1 = new Vertex<>(1);
//        Vertex<Integer> v2 = new Vertex<>(2);
//        Vertex<Integer> v3 = new Vertex<>(3);
//        Vertex<Integer> v4 = new Vertex<>(4);
//        Vertex<Integer> v5 = new Vertex<>(5);
//        Vertex<Integer> v6 = new Vertex<>(6);
//
//        v0.setNeighbors(Arrays.asList(v1, v5, v6));
//        v1.setNeighbors(Arrays.asList(v3, v4, v5));
//        v4.setNeighbors(Arrays.asList(v2, v6));
//        v6.setNeighbors(Arrays.asList(v0));
//
//        BreadthFirstSearch<Integer> bfs = new BreadthFirstSearch<>(v1);
//        bfs.traverse();

        // DFS
//        VertexDfs<Integer> v0 = new VertexDfs<>(0);
//        VertexDfs<Integer> v1 = new VertexDfs<>(1);
//        VertexDfs<Integer> v2 = new VertexDfs<>(2);
//        VertexDfs<Integer> v3 = new VertexDfs<>(3);
//        VertexDfs<Integer> v4 = new VertexDfs<>(4);
//        VertexDfs<Integer> v5 = new VertexDfs<>(5);
//        VertexDfs<Integer> v6 = new VertexDfs<>(6);
//
//        v0.setNeighbors(Arrays.asList(v1, v5, v6));
//        v1.setNeighbors(Arrays.asList(v3, v4, v5));
//        v4.setNeighbors(Arrays.asList(v2, v6));
//        v6.setNeighbors(Arrays.asList(v0));
//
//        DepthFirstSearch<Integer> bfs = new DepthFirstSearch<>();
//        bfs.traverse(v0);

//        bfs.findMaxVertex(v0);
//        System.out.println("****** GET MAX *****");
//        System.out.println(bfs.getMaxVal());


    }

    static boolean canSum(int[] n, int len, int sum){
        if(hm.containsKey(sum)) return hm.get(sum);

        if(sum == 0) return true;
        if(sum < 0) return false;
        for(int i = 0; i < len; i++){
            if(canSum(n, len, sum-n[i])){
                hm.put(sum-n[i], true);
                return true;
            }else {
                hm.put(sum-n[i], false);
            }
        }
        return false;
    }
}



// BINARY SEARCH TREE
//
//         10
//    5           15
//       8
//
//
// Binary Search Tree
class Node{

    Node left, right;
    int data;

    public Node(int data){
        this.data = data;
    }

    public void insert(int value){
        if(value <= data){
            if(left == null)
                left = new Node(value);
            else left.insert(value);
        }else{
            if(right == null)
                right = new Node(value);
            else
                right.insert(value);
        }
    }

    public boolean contains(int value){
        if(value == data)
            return true;
        else if(value < data){
            if(left == null)
                return false;
            else
                return left.contains(value);
        }else {
            if (right == null)
                return false;
            else
                return right.contains(value);
        }
    }

    // in-order printing
    public void printOrder(){
        if(left != null)
            left.printOrder();
        System.out.println(data);
        if(right != null)
            right.printOrder();
    }
}

// Breadth-First search
class Vertex<T> {
    private final T data;

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    private boolean visited;

    Vertex(T data) {
        this.data = data;
    }

    public List<Vertex<T>> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(List<Vertex<T>> neighbors) {
        this.neighbors = neighbors;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "data=" + data +
                ", visited=" + visited +
                '}';
    }

    private List<Vertex<T>> neighbors = new LinkedList<>();
}

class BreadthFirstSearch<T> {
    private final Vertex<T> startVertex;
    public BreadthFirstSearch(Vertex<T> startVertex){
        this.startVertex = startVertex;
    }

    public void traverse(){
        Queue<Vertex<T>> queue = new LinkedList<>();
        queue.add(startVertex);
        while (!queue.isEmpty()){
            Vertex<T> current = queue.poll();
            if(!current.isVisited()){
                current.setVisited(true);
                System.out.println(current);
                queue.addAll(current.getNeighbors());
            }
        }
    }
}

// ----- BFS END ---------//

// Depth First Search

class VertexDfs<T> {
    public T getData() {
        return data;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<VertexDfs<T>> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(List<VertexDfs<T>> neighbors) {
        this.neighbors = neighbors;
    }

    private List<VertexDfs<T>> neighbors = new LinkedList<>();
    private final T data;
    private boolean visited;
    public VertexDfs(T data){
        this.data = data;
    }

    public boolean isVisited(){
        return  visited;
    }

    @Override
    public String toString() {
        return "VertexDfs{" +
                "data=" + data +
                ", visited=" + visited +
                '}';
    }

}

class DepthFirstSearch<T> {
    public int getMaxVal() {
        return maxVal;
    }

    public void setMaxVal(int maxVal) {
        this.maxVal = maxVal;
    }

    private int maxVal = Integer.MIN_VALUE;
    public void traverse(VertexDfs<T> startVertex){
        Deque<VertexDfs<T>> stack = new LinkedList<>();
        stack.push(startVertex);
        while (!stack.isEmpty()){
            VertexDfs<T> current = stack.pop();
            if(!current.isVisited()){
                current.setVisited(true);
                System.out.println(current);
                Collections.reverse(current.getNeighbors());
                current.getNeighbors().forEach(stack::push);
//            stack.addAll(current.getNeighbors());
            }
        }
    }

    // using recursively
    public void traverseRecursively(VertexDfs<T> startVertex){
        startVertex.setVisited(true);
        System.out.println(startVertex);
        startVertex.getNeighbors().stream()
                .filter(neighbor -> !neighbor.isVisited())
                .forEach(this::traverseRecursively);
    }
//
//    public void findMaxVertex(VertexDfs<T> star){
//        star.setVisited(true);
//        if((int)star.getData() > maxVal) {
//            setMaxVal((int) star.getData());
//        }
//        star.getNeighbors().stream()
//                .filter(neighbor -> !neighbor.isVisited())
//                .forEach(this::traverseRecursively);
//    }
//

}

// DFS ------- END -------

































