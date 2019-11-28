package decisionmaking;

import java.util.Scanner;

public class fallthrough {
	public static void main(String arg[])
	{
		Scanner s=new Scanner (System.in);
		System.out.println("enter the value ");
		int n=s.nextInt();
		switch(n)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		System.out.println("31 days");
		break;
		case 4:
		case 6:
		case 9:
		case 12:
			System.out.println("30 days");
			break;
		case 2:
			System.out.println("28 or 29 days");
			break;
		default:
			System.out.println("invalid month");
			break;
	}
	
	}

}
