/*
 * Binary Search: Search a sorted array by repeatedly dividing the search interval in half. 
 * Begin with an interval covering the whole array. 
 * If the value of the search key is less than the item in the middle of the interval, 
 * narrow the interval to the lower half. 
 * Otherwise narrow it to the upper half. 
 * Repeatedly check until the value is found or the interval is empty.
 */

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

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
		Arrays.sort(array);
		int index = binarySearch(array, searchValue);
	    System.out.println(index!=-1 ? "Search value found at index "+index : "Search value not found");
	}
	
	public static int binarySearch(int array[], int searchValue)
	{
		int first = 0, last = array.length - 1;
		while(first<=last)
		{
			int mid = (first + last )/2;
			if(array[mid]==searchValue) {
				return mid;
			}else if(searchValue<array[mid]) {
				last = mid - 1;
			}else {
				first = mid + 1;
			}
		}
		return -1;
	}
	
}
