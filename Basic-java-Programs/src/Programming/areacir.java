package Programming;
import java.util.Scanner;

public class areacir {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the radius :");
		int r=s.nextInt();
		float pi=(float) 3.14;
		double area=2*pi*r;
		System.out.println(area);
	}

}

