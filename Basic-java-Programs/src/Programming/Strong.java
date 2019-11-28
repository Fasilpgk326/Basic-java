package Programming;
import java.util.Scanner;

public class Strong {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(); 
		int sum=0;
		int a=n;
		while(n>0)
		{
			int fact=1,i=1;
			int r=n%10;
			while(i<=r)
			{
				fact=fact*i;
				i++;
			}
			sum=sum+fact;
			n=n/10;
		}
		if(a==sum)
		{
			System.out.println("is strong");
		}
		else
		{
			System.out.println("is not Strong");
		}

	}

}
