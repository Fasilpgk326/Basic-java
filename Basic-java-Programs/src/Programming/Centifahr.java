package Programming;
import java.util.Scanner;

public class Centifahr {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the centigrade:");
		int centi=s.nextInt();
		double result=(centi*1.8)+32;
		System.out.println(result);
		
	}

}
