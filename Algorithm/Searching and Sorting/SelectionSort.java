import java.util.Scanner;

public class SelectionSort {

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
		array = selectionSort(array);
		for(int i : array) {
			System.out.print(i+" ");
		}
	}
	
	public static int[] selectionSort(int array[])
	{
		int index_min = 0, temp;
		for(int i=0; i<array.length-1; i++)
		{
			index_min = i;
			for(int j=i+1; j<array.length; j++)
			{
				if(array[j]<array[index_min]) {
					index_min = j;
				}
			}
			if(i!=index_min)
			{
				temp = array[index_min];
				array[index_min] = array[i];
				array[i] = temp;
			}
		}
		return array;
	}
}
