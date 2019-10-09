/*
 * This algorithm works as like binary search but it create 3 sub array 
 * to search the key value.
 */
import java.util.Arrays;
import java.util.Scanner;

public class TernarySearch {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n,array[];
		System.out.print("Enter the data length : ");
		n = sc.nextInt();
		array = new int[n];
		System.out.println("Enter array elements : ");
		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
		}
		System.out.print("Enter search value : ");
		int searchValue = sc.nextInt();
		sc.close();
		Arrays.sort(array);
		int index = ternarySearch(array, searchValue);
	    System.out.println(index!=-1 ? "Search value found at index "+index : "Search value not found");
	}
	
	public static int ternarySearch(int[] array, int searchValue)
	{
		int f, r, div;
		
		f = 0;
		r = array.length - 1;
		while(r>=f)
		{
			// Find the length for every block
			div = (r-f)/3;
			
			// f to mid1 is first block
			int mid1 = f + div;
			
			// mid1 to mid2 is second block
			int mid2 = mid1+ div;
			
			/*
			 * If search value found at index mid1 then return it
			 */
			if(array[mid1]==searchValue)
				return mid1;
			/*
			 * else if search value found at mid2 then return it
			 */
			else if(array[mid2]==searchValue)
				return mid2;
			/*
			 * else if the search value is less than the value of mid1 index 
			 * we need to search it first block 
			 * that is indexed (f to mid1-1) 
			 */
			else if(array[mid1]>searchValue)
				r = mid1 - 1;
			/*
			 * else if the search value is greater than the value of mid2 index
			 * we need to search if third block
			 * that is indexed (mid2+1 to r) 
			 */
			else if(array[mid2]<searchValue)
				f = mid2 + 1;
			/*
			 * else we search it between mid1+1 and mid2-1
			 */
			else {
				f = mid1 + 1;
				r = mid2 - 1;
			}
		}
		return -1;
	}
}
