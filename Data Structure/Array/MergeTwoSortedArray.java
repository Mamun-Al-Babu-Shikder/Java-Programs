import java.util.Scanner;
import java.util.Arrays;

public class MergeTwoSortedArray
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int a[], b[], c[], m, n, i;
		System.out.print("Enter the length of array a[] : ");
		m =  sc.nextInt();
		a = new int[m];
		
		System.out.println("Enter array element : ");
		for(i=0;i<m;i++)
			a[i] = sc.nextInt();
		
		System.out.print("Enter the length of array b[] : ");
		n =  sc.nextInt();
		b = new int[n];
		
		System.out.println("Enter array element : ");
		for(i=0;i<n;i++)
			b[i] = sc.nextInt();
		
		/* 
		 * Sort two array before merge
		 */
		Arrays.sort(a);
		Arrays.sort(b);
		
		/*
		 * Call method to merge 
		 */
		c = mergeArray(a,b);
		
		/*
		 * Print element after merge
		 */
		for(int v : c)
			System.out.print(v+" ");
		
		sc.close();
	}
	
	public static int[] mergeArray(int a[], int b[]) {
		
		int i,j,k,len1 = a.length, len2 = b.length;
		int c[] = new int[len1+len2];
		
		j = k = 0;
		
		for(i=0;i<(len1+len2);i++)
		{
			if(j<len1 && k<len2){
				
				if(a[j]<b[k]){
					c[i] = a[j];
					j++;
				}else {
					c[i] = b[k];
					k++;
				}
				
			}else if(j<len1) {
				c[i] = a[j];
				j++;
			}else {
				c[i] = b[k];
				k++;
			}
		}
		
		return c;
	}
	
}