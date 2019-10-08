import java.util.Arrays;
import java.util.Scanner;

public class JumpSearch {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n,array[];
		System.out.print("Enter the data length : ");
		n = sc.nextInt();
		array = new int[n];
		System.out.println("Enter array element : ");
		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
		}
		System.out.print("Enter search value : ");
		int searchValue = sc.nextInt();
		sc.close();
		Arrays.sort(array);
		
		int index = jumpSearch(array, searchValue);
	    System.out.println(index!=-1 ? "Search value found at index "+index : "Search value not found");
		
	}
	
	public static int jumpSearch(int array[], int searchValue) {
		
		int i , start, end;
		
		int len = array.length;
		int n = (int) Math.sqrt(len);
		
		start = 0;
		end = n;
		
		// Search the block where search value can present
		while(end<len){
			if(searchValue<=array[end])
				break;
			start = end;
			end += n;
		}
		
		end = (int) Math.min(end, len-1);
		
		// Linear search to find search value 
        for(i=start; i<=end ;i++) {
			if(searchValue==array[i])
				return i;
		}

		return -1;
	}
}
