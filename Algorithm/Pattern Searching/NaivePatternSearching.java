import java.util.Scanner;

public class NaivePatternSearching {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String text, pattern;
		System.out.print("Enter text : ");
		text = sc.nextLine();
		System.out.print("Enter search pattern : ");
		pattern = sc.nextLine();
		sc.close();
		search(text, pattern);
	}
	
	public static void search(String text, String pattern)
	{
		int textLen = text.length();
		int patternLen = pattern.length();
		int j, k;
		boolean found = false;
		
		for(int i=0;i<=textLen-patternLen; i++)
		{
			k = 0;
			for(j=i; j<i+patternLen;j++) {
				if(text.charAt(j)==pattern.charAt(k)) 
					k++;
				else 
					break;
			}
			if(j==i+patternLen) {
				found = true;
				System.out.println("Pattern found at index : "+i);
			}
		}
		
		if(!found) {
			System.out.println("Pattern not found");
		}
	}
}
