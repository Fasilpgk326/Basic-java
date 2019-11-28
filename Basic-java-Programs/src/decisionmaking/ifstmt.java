package decisionmaking;

import java.util.Scanner;

public class ifstmt
{
	public static void main(String arg[])
	{
		Scanner s =new Scanner(System.in);
		System.out.println("age=");
		int a=s.nextInt();
		if(a>18)
		{
			System.out.println("eligible for vote");
		}
		else
		   {
			System.out.println("not eligibile for vote");
		   }
		}
	}


