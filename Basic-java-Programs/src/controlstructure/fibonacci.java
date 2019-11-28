package controlstructure;

import java.util.Scanner;

public class fibonacci {
	public static void main(String arg[])
	{
	Scanner s =new Scanner(System.in);
		//System.out.println("enter the value");
		int n=s.nextInt();
		
        int  a=0,b=1;
        System.out.println("fibonacci series are");
        for(int i=0;i<=n;i++)
        {
        	 
        	 
        	int c=a+b;
        	System.out.printf("%d ",c);
        	a=b;
        	b=c;
        	
         }
				
	}
}
