package crackingTheCodingInterviews.arraysAndStringChapter1;

import java.util.Arrays;

public class ZeroMatrix {
    public static void main(String[] args) {

        int b[][] = {
                {1, 2},
                {3, 0}
        };
        int c[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 0, 9}
        };
        printMatrix(b);
        printMatrix(makeZeroMatrix(b));
        printMatrix(c);
        printMatrix(makeZeroMatrix(c));
    }

    public static int[][] makeZeroMatrix(int[][] matrix) {
        int[][] result = new int[matrix.length][matrix[0].length];
        for(int r[]: result)
            Arrays.fill(r, -1);
        for(int row=0;row<matrix[0].length;row++) {
            for(int column=0;column<matrix[0].length;column++) {
                if(matrix[row][column] ==0) {
                    //fill row with zeros
                    Arrays.fill(result[row],0);
                    //fill column with zeros
                    for(int selrow=0;selrow<matrix[0].length;selrow++) {
                        result[selrow][column] = 0;
                    }
                } else {
                    if(result[row][column] != 0) {
                        result[row][column] = matrix[row][column];
                    }
                }

            }

        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for(int row=0;row<matrix.length;row++) {
            System.out.println();
            for(int column=0;column<matrix[0].length;column++) {
                System.out.print(matrix[row][column] + " ");
            }
        }
    }

}
