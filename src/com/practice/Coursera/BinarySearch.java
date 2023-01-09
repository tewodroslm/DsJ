package Coursera;

public class BinarySearch  {

    public static void main(String[] args) {
        int[] lis = { 2, 5, 6, 9};

        int target = 6;

        System.out.println(binarySearch(lis, target));
    }

    static int binarySearch(int[] list, int target){

        int start = 0;
        int end = list.length-1;

        while(start <= end){

            int middle = (start + end)/2;
            if(target < list[middle]){
                end = middle - 1;
//                continue;
            }else if(target > list[middle]){
                start = middle + 1;
//                continue;
            }else {
                return middle;
            }
        }
        return -1;
    }

    static int bS(int[] list, int target){
        int start = 0;
        int end = list.length-1;

        while(start <= end){
            int middle = (start + end) / 2;

            if(target < list[middle]){
                end = middle - 1;
                continue;
            }else if(target > list[middle]){
                start = middle + 1;
                continue;
            }else {
                return middle;
            }
        }

        return -1;
    }

    static int bs3(int[] list , int target){

        int size = list.length-1;
        int start = 0;
        int end = size;
        while(start <= end){
            int middle = (start + end) / 2;

            if(target < list[middle]){
                end = middle - 1;
            }else if(target > list[middle]){
                start = middle + 1;
            }else {
                return  middle;
            }
        }
        return -1;
    }

}
