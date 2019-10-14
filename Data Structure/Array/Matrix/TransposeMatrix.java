import java.util.Scanner;

/*
 * The transpose of a matrix is a new matrix whose rows are the columns of the original.
 */
public class TransposeMatrix {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[][] matrix, transpose_matrix;
		int r, c, i, j;
		
		System.out.print("Enter the number of row and column : ");
		r = sc.nextInt();
		c = sc.nextInt();
		
		matrix = new int[r][c];
		transpose_matrix = new int[c][r];
		
		System.out.println("Enter the elements of matrix : ");
		for(i=0;i<r;i++)
			for(j=0;j<c;j++){
				System.out.printf("matrix[%d][%d] = ", i, j);
				matrix[i][j] = sc.nextInt();
			}

		sc.close();
		/*
		 * Process of transpose a matrix
		 */
		for(i=0;i<r;i++)
			for(j=0;j<c;j++)
				transpose_matrix[j][i] = matrix[i][j];
		
		
		System.out.println("\nOrginal matrix :");
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++)
				System.out.print(matrix[i][j]+"	");
		    System.out.println();
		}
		
		System.out.println("\nTranspose matrix :");
		for(i=0;i<c;i++) {
			for(j=0;j<r;j++)
				System.out.print(transpose_matrix[i][j]+"	");
		    System.out.println();
		}
	}
}
