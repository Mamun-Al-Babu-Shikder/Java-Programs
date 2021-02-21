package main;

public class ReplicationMatrix {

    public static void main(String[] args) {

        System.out.println("Given Matrix:");
        int row = 3, col = 3;
        int[][] a = {{1,2,3},
                {4,5,6},
                {7,8,9}};
        print2DArray(row, col, a);

        System.out.println("\nReplication Matrix:");

        int ir = 0, ic, rc = 3, cc = 3, n_row = row * rc, n_col = col * cc;
        int b[][] = new int[n_row][n_col];

        for (int i=0; i<row; i++) {
            ic = 0;
            for (int j = 0; j < col; j++) {
                for (int m=ir; m<ir+rc; m++){
                    for (int n=ic; n<ic+cc; n++){
                        b[m][n] = a[i][j];
                    }
                }
                ic+=cc;
            }
            ir+=rc;
        }
        print2DArray(n_row, n_col, b);
    }


    public static void print2DArray(int row, int col, int[][] a){
        for (int i=0; i<row; i++) {
            for (int j = 0; j < col; j++)
                System.out.print(a[i][j] + "  ");
            System.out.println();
        }
    }
}