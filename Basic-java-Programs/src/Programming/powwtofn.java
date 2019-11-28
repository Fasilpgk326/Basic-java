package Programming;
import java.util.Scanner;

public class powwtofn {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the pow value");
		int exp=s.nextInt();
		System.out.println("enter the base value");
		int base=s.nextInt();
		int p = 1;
		int i;
		for(i=1;i<=exp;i++)
		{
			p=p*base;
		}
		System.out.println(p);
	}

}
