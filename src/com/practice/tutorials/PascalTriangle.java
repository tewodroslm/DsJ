package tutorials;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> triangle = new ArrayList<>();

        if(numRows == 0) return triangle;

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        for(int i = 1; i < numRows; i++){

            List<Integer> previousRow = triangle.get(i-1);
            System.out.println("**** get **** " + triangle.get(i-1).toString());
            List<Integer> row = new ArrayList<>();

            row.add(1);
            for(int j = 1; j < i; j ++){
                row.add(previousRow.get(j-1) + previousRow.get(j));
            }
            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }
}
