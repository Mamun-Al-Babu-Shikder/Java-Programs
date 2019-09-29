/*
 * Bubble sort is a simple sorting algorithm. 
 * This sorting algorithm is comparison-based algorithm 
 * in which each pair of adjacent elements is compared and 
 * the elements are swapped if they are not in order. 
 * This algorithm is not suitable for large data sets as its 
 * average and worst case complexity are of Ο(n2) where n is the number of items.
*/

import java.util.Scanner;

public class BubbleSort {

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
		sc.close();
		array = sort(array);
		System.out.println("After 'Bubble Sort' : ");
		for(int i : array) {
			System.out.print(i+" ");
		}
	}
	
	public static int[] sort(int array[]) {
		boolean isSwaped = true;
		int j = 0;
		while(isSwaped) {
			isSwaped = false;
			for(int i=0;i<array.length-j-1;i++) {
				if(array[i]>array[i+1]) {
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
					isSwaped = true;
				}
			}
			j++;
		}
		return array;
	}
}
