package decisionmaking;

import java.util.Scanner;

public class ifladder
    {
	public static void main(String arg[])
	{
		Scanner s =new Scanner(System.in);
		System.out.println("year=");
		int year=s.nextInt();
		if(year>=1&&year<=2)
		{
			System.out.println("salary=20000");
		}
		else if(year>=3&&year<=4)
		{
			System.out.println("salary=30000");
		}
		else
		{
			System.out.println("not available");
		}
	}
	

}
