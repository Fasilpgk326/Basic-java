package Programming;
import java.util.Scanner;

public class palin {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		int a = 0;
		int temp=n;
		while(n!=0)
		{
			a=n%10;
			sum=sum*10+a;
			n=n/10;
		}	
			if(temp==sum)
			{
				System.out.println("is a palindrome");
				
		    }
			else
			{
				System.out.println("is not palindrome");
			}
	}

}
