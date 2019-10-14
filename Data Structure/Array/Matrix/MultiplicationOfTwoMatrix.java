import java.util.Scanner;

/*
 * When we do multiplication: The number of columns of the first_matrix must equal the number of rows of the second_matrix. 
 * And the result will have the same number of rows as the first_matrix, and the same number of columns as the second_matrix.
 */
public class MultiplicationOfTwoMatrix {

	public static void main(String[] args)
	{
		int[][] first_matrix, second_matrix, result_matrix;
		int r1, c1, r2, c2, i, j, k, sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of row and column for first_matrix  : ");
		r1 = sc.nextInt();
		c1 = sc.nextInt();
		
		System.out.print("Enter the number of row and column for second_matrix  : ");
		r2 = sc.nextInt();
		c2 = sc.nextInt();
		
		/*
		 * If the number of first_matrix column and second_matrix row are not same then we can't multiply them. 
		 */
		if(c1!=r2){
			System.out.println("Matrices are not multipliable.");
		}else {
			
			first_matrix = new int[r1][c1];
			second_matrix = new int[r2][c2];
			result_matrix = new int[r1][c2];
			
			System.out.println("\nEnter the elements of first_matrix : ");
			for(i=0;i<r1;i++)
				for(j=0;j<c1;j++){
					System.out.printf("first_matrix[%d][%d] = ", i, j);
					first_matrix[i][j] = sc.nextInt();
				}
			
			System.out.println("\nEnter the elements of second_matrix : ");
			for(i=0;i<r2;i++)
				for(j=0;j<c2;j++){
					System.out.printf("second_matrix[%d][%d] = ", i, j);
					second_matrix[i][j] = sc.nextInt();
				}
			
			sc.close();
			
			/*
			 * Process to multiply two matrix. 
			 */
			for(i=0;i<r1;i++) {
				for(j=0;j<c2;j++) {
					sum = 0;
					for(k=0;k<r2;k++)
						sum = sum + first_matrix[i][k] * second_matrix[k][j];
					result_matrix[i][j] = sum;
				}
			}
			
			System.out.println("\nResult after multiplication : ");
			for(i=0;i<r1;i++) {
				for(j=0;j<c2;j++) 
					System.out.print(result_matrix[i][j]+"  ");
				System.out.println();
			}
			
		}
	}
}
