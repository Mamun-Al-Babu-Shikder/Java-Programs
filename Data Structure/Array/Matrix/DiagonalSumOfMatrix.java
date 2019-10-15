/*
 * Given a 2D square matrix, find sum of elements in Primary and Secondary diagonals.
 */
import java.util.Scanner;

public class DiagonalSumOfMatrix {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[][] matrix;
		int n, i, j, primary_diagonal = 0, secondary_diagonal = 0;
		
		System.out.print("Entre the number of row or column : ");
		n = sc.nextInt();
		
		matrix = new int[n][n];
		
		System.out.println("\nEnter the elements of matrix : ");
		for(i=0;i<n;i++)
			for(j=0;j<n;j++){
				System.out.printf("matrix[%d][%d] = ", i, j);
				matrix[i][j] = sc.nextInt();
			}
		
		sc.close();
		
		/*
		 * Process to sum of the primary and secondary diagonal 
		 */
		for(i=0;i<n;i++) {
			primary_diagonal += matrix[i][i];
			secondary_diagonal += matrix[n-1-i][i];
		}
		
		System.out.println("Sum of Primary diagonal = "+primary_diagonal);
		System.out.println("Sum of Secondary diagonal = "+secondary_diagonal);
		
	}
	
}
