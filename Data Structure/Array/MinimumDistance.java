import java.util.Scanner;

public class MinimumDistance {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x, y, n, a[];
		
		System.out.print("Enter data length : ");
		n = sc.nextInt();
		System.out.println("Enter numbers : ");
		a = new int[n];
		for(int i=0; i<n ;i++)
			a[i] = sc.nextInt();
		System.out.print("Enter distance from number x : ");
		x = sc.nextInt();
		System.out.print("Enter distance to number y : ");
		y = sc.nextInt();
		sc.close();
		
		System.out.println("Minimum Distance between "+x+" and "+y+" is = "+getMinimumDistance(a,x,y));
	}
	
	public static int getMinimumDistance(int a[], int from, int to) {
		
		int distance = Integer.MAX_VALUE;
		
		for(int i = 0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if((from == a[i] && to == a[j] || from == a[j] && to == a[i]) && Math.abs(i - j) < distance)
				{
					distance = Math.abs(i - j);
				}
			}
		}
		return distance;
	}
}
