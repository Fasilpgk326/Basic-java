package Programming;
import java.util.Scanner;

public class amstrong {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int ams=0;
		int b=n;
		while(n>0)
		{
			int r=n%10;
			ams=(r*r*r)+ams;
			n=n/10;
		}
			if(b==ams)
			{
				System.out.println("Is a armstrong");
		}
			else
			{
				System.out.println("Is not a armstrong");
			}
			
		
	}
}
