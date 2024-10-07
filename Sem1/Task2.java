package Sem1;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int [][] matrix = {{1,0,1},{1,1,1}, {1,0,0}};
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(sumMatrix(matrix));
    }

    public static int sumMatrix(int [][] matrix) {
        int n = matrix.length;
        for (int[] row : matrix) {
            if (row.length != n) {
                throw new RuntimeException("Столбцы не равны строкам.");
            }
        }
        for (int[] row : matrix) {
            for (int element : row) {
                if (element != 0 && element != 1)
                    throw new RuntimeException("Массив должен содрежать 1 и 0");
            }
        }
        int sum = 0;
        for(int [] row :matrix){
            for (int element : row){
                sum += element;
            }
        }
        return sum;
    }
}
