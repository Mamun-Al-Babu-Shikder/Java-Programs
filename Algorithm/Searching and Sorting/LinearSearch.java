import java.util.Scanner;

/*
 * Start from the leftmost element of array[] and one by one compare x with each element of array[]
 * If x matches with an element, return the index.
 * If x doesn’t match with any of elements, return -1.
 */

public class LinearSearch {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n,array[];
		System.out.print("Enter the data length : ");
		n = sc.nextInt();
		array = new int[n];
		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
		}
		System.out.print("Enter search value : ");
		int searchValue = sc.nextInt();
		sc.close();
		int index = linearSearch(array, searchValue);
		if(index==-1) {
			System.out.println("Search value not found");
		}else {
			System.out.println("Search value found at index : "+index);
		}
		
	}

	public static int linearSearch(int array[], int searchValue)
	{
		for(int i=0;i<array.length;i++) {
			if(array[i]==searchValue) {
				return i;
			}
		}
		return -1;
	}
}
