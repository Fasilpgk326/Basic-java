package decisionmaking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class leapycent 
{
	public static void main(String arg[]) throws NumberFormatException, IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter year");
	System.out.println();
	int year=Integer.parseInt(br.readLine());
	if(year%4==0)
	{
		if(year%100==0)//checking for century
		{
			if(year%4==0)
	       {
			System.out.println("is leap year"+year);
		   }
			else
		     {
			System.out.println("is not leap year "+year);
		}    }
		else
		{
			System.out.println("is  leap year"+year);
		}
	}
	else
	{
		System.out.println("is not leap year"+year);
		
		}
		
	}
	

}
