import java.util.Scanner;
/*
 * Two matrix can be sum if the row and column of those matrix are same.
 * Let's consider two matrix named first_matrix and second_matrix
 * And result_matrix that hold the sum of those two matrix. 
 * r and c are the number of row and column of those matrix.
 */
public class SumOfTwoMatrix {

	public static void main(String[] args)
	{
		/*
		 * Create two dimensional array for matrix
		 */
		int[][] first_matrix, second_matrix, result_matrix;
		int r, c, i, j;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of row and column  : ");
		r = sc.nextInt();
		c = sc.nextInt();
		
		first_matrix = new int[r][c];
		second_matrix = new int[r][c];
		result_matrix = new int[r][c];
		
		System.out.println("Enter the elements of first_matrix : ");
		for(i=0;i<r;i++)
			for(j=0;j<c;j++){
				System.out.printf("first_matrix[%d][%d] = ", i, j);
				first_matrix[i][j] = sc.nextInt();
			}
		
		System.out.println("\nEnter the elements of second_matrix : ");
		for(i=0;i<r;i++)
			for(j=0;j<c;j++){
				System.out.printf("second_matrix[%d][%d] = ", i, j);
				second_matrix[i][j] = sc.nextInt();
			}
			
		sc.close();
		/*
		 * Adding two matrix and assign the sum to the result_matrix
		 */
		for(i=0;i<r;i++){
			for(j=0;j<c;j++) {
				result_matrix[i][j] = first_matrix[i][j] + second_matrix[i][j];
			}
		}
		
		/*
		 * Print the result_matrix
		 */
		System.out.println("\nSum of two matrix :");
		for(i=0;i<r;i++){
			for(j=0;j<c;j++) {
				System.out.print(result_matrix[i][j]+"	");
			}
			System.out.println();
		}
	}
}