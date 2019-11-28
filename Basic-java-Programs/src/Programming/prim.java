package Programming;
import java.util.Scanner;

public class prim {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int c=0;
		for(int i=2;i<=n;i++)
		{
		if(n%i==0)
		{
			c++;
		}}
		if(c==1)
		{
			System.out.println("is prime number");
		}
		else
		{
			System.out.println("is not prime number");
		}
	}

}
