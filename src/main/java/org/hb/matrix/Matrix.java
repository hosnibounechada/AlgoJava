package org.hb.matrix;

public class Matrix {
    // --- Directions
    // Write a function that accepts an integer N
    // and returns a NxN spiral matrix.
    // --- Examples
    //   matrix(2)
    //     [[1, 2],
    //     [4, 3]]
    //   matrix(3)
    //     [[1, 2, 3],
    //     [8, 9, 4],
    //     [7, 6, 5]]
    //  matrix(4)
    //     [[1,   2,  3, 4],
    //     [12, 13, 14, 5],
    //     [11, 16, 15, 6],
    //     [10,  9,  8, 7]]

    public int[][] matrix(int n) {
        int[][] mat = new int[n][n];
        int startCol = 0;
        int endCol = n - 1;

        int startRow = 0;
        int endRow = n - 1;

        int counter = 1;

        while(startCol <= endCol && startRow <= endRow){
            for(int i = startCol; i <= endCol; i++){
                mat[startRow][i] = counter++;
            }
            startRow++;

            for(int i = startRow; i <= endRow; i++){
                mat[i][endCol] = counter++;
            }
            endCol--;

            for(int i = endCol; i >= startCol; i--){
                mat[endRow][i] = counter++;
            }
            endRow--;

            for(int i = endRow; i >= startRow; i--){
                mat[i][startCol] = counter++;
            }
            startCol++;
        }
        return mat;
    }
}
