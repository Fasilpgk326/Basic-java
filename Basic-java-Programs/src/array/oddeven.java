package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class oddeven 
{
	public static void main(String arg[]) throws NumberFormatException, IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter size of array");
	int size=Integer.parseInt(br.readLine());
	int[] a=new int[size];
	int sum=0,sum1=0;
	int b=0,c=0;
	int i=0;
	System.out.println("enter the array");
     for(i=0;i<size;i++)	
	{
    	 a[i]=Integer.parseInt(br.readLine());
	}	 
	
		for (i=0;i<size;i++)
		{
			if(a[i]%2==0)
			{
			System.out.println("odd number");
			System.out.println(a[i]);
			sum1=sum+a[i];
			b++;
		}
		}
		for (i=0;i<size;i++)
		{
			if(a[i]!=0)
			{
			System.out.println("even number");
			System.out.println(a[i]);
			sum1=sum+a[i];
			c++;
			}
			}
			float o=sum;
			float e=sum1;
			System.out.println("average of odd=");
			System.out.println(o);
			System.out.println("average of even");
			System.out.println(e);
		}
		
	}
	

