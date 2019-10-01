import java.util.Scanner;

public class InsertionSort {

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
		array = insertionSort(array);
		for(int i : array) {
			System.out.print(i+" ");
		}
	}
	
	public static int[] insertionSort(int array[])
	{
		int temp,  j;
		for(int i=1;i<array.length;i++)
		{
			j = i-1;
			temp = array[i];
			while(j>=0 && temp<array[j]) {
				array[j+1] = array[j];
				j = j - 1;
			}
			j = j+1;
			array[j] = temp;
		}
		return array;
	}
}
