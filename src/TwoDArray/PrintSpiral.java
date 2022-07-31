/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TwoDArray;

/**
 *
 * @author Lenovo
 */
public class PrintSpiral {

//one test case failed
    public static void spiralPrint(int matrix[][]) {
        //Your code goes here
        if (matrix.length == 0) {
            return;
        }
        int rs = 0;
        int re = matrix.length - 1;
        int cs = 0;
        int ce = matrix[0].length - 1;
        int i, j, c = 1;

        if ((re + 1) == 1) {
            for (j = cs; j <= ce; j++) {
                System.out.print(matrix[rs][j] + " ");
            }
        } else if ((ce + 1) == 1) {
            for (i = rs; i <= re; i++) {
                System.out.print(matrix[i][cs] + " ");
            }
        } else {
            while (c <= (matrix.length * matrix[0].length)) {
                for (j = cs; j <= ce && c <= (matrix.length * matrix[0].length); j++) {
                    System.out.print(matrix[rs][j] + " ");
                    c++;
                }
                rs++;
                for (i = rs; i <= re && c <= (matrix.length * matrix[0].length); i++) {
                    System.out.print(matrix[i][ce] + " ");
                    c++;
                }
                ce--;
                for (j = ce; j >= cs && c <= (matrix.length * matrix[0].length); j--) {
                    System.out.print(matrix[re][j] + " ");
                    c++;
                }
                re--;
                for (i = re; i >= rs && c <= (matrix.length * matrix[0].length); i--) {
                    System.out.print(matrix[i][cs] + " ");
                    c++;
                }
                cs++;
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {14, 15, 16, 5}, {13, 20, 17, 6}, {12, 19, 18, 7}, {11, 10, 9, 8}};
        spiralPrint(arr);

    }
}
