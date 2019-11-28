package controlstructure;

import java.util.Scanner;

public class fib {
	public static void main(String arg[])
	{
	Scanner s =new Scanner(System.in);
		System.out.println("enter the value");
		int j=s.nextInt();
        int  a=0,b=1;
        int m=0;
        int d=5;
        int c=0;
        System.out.println("fibonacci series are");
        for(int i=0;i<=10;i++)
        {
        	 System.out.printf("%d ",a);
        	 
        	 c=a+b;
        	 if(c==d)
        	{
        		j=m++;
        		}
            a=b;
        	b=c;
        }
        System.out.println();
        if(j==0)
        {
        	 System.out.println("yes");
        }
        else
        {
        	 System.out.println("no");
         }
				
	}
}


