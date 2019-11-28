package Programming;
import java.util.Scanner;

public class fibn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=s.nextInt();
		int a=0;
		int b=1;
		int c=0;
		System.out.printf(" %d %d",a,b);
		for(int i=1;i<=n;i++)
		{
		c=a+b;
		System.out.printf(" %d",c);
		a=b;
		a=c;
		}
		

	}

}
