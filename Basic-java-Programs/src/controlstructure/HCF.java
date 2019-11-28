package controlstructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HCF
{
	public static void main(String arg[]) throws NumberFormatException, IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter 2 num");
	System.out.println();
	int a=Integer.parseInt(br.readLine());
	int b=Integer.parseInt(br.readLine());
	int x = 0,y = 0,lcm,hcf = 0;
	int min=(a<b)?a:b;
	for(int i=min;i>0;i++)
	{
		if(a%i==0&&b%i==0)
		{
			hcf=i;
			break;
		}
		}
	System.out.println(hcf);
}

}
