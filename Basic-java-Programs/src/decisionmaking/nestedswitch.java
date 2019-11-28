package decisionmaking;

import java.util.Scanner;

public class nestedswitch {
	
	public static void main(String arg[]) 
	{
		Scanner s =new Scanner(System.in);
		System.out.println("choose your dish");
		System.out.println("a)veg\n b)non-veg\n");
		char dishes = s.next().charAt(0);
		switch(dishes)
		{
		case 'a':
			System.out.println("choose ur time");
			System.out.println("1)breakfast 2)lunch\n");
			int time =s.nextInt();
				switch(time)
				{
				case 1:
					System.out.println("dosa");
					break;
				case 2:
					System.out.println("meals");
					break;
					default:
						System.out.println("not available");
						break;
					}
		case 'b':
			System.out.println("choose ur time");
			System.out.println("1)breakfast \n 2)lunch\n");
			int tim =s.nextInt();
				switch(tim)
				{
				case 1:
					System.out.println("poratta-beef");
					break;
				case 2:
					System.out.println("nonveg-biriyani");
					break;
					default:
						System.out.println("not available");
						break;
				}
			
	}
		

}
}
