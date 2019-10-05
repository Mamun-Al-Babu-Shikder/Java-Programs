import java.util.Scanner;

public class MaxSubArraySum {

	public static void main(String[] args) {
		
		int n, a[];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter data length : ");
		n = sc.nextInt();
		a = new int[n];
		
		System.out.println("Enter array element : ");
		for(int i=0; i<n; i++)
			a[i] = sc.nextInt();
		sc.close();
		
		System.out.println("Maximum subarray sum is = "+maxSubArraySum(a));
	}
	
	public static int maxSubArraySum(int a[]) {
		
		int sum = Integer.MIN_VALUE, temp = 0;
		
		for(int i=0; i<a.length; i++)
		{
			temp = temp + a[i];
			if(sum<temp) {
				sum = temp;
			}
			if(temp<0) {
				temp = 0;
			}
		}
		
		return sum;
	}
}
