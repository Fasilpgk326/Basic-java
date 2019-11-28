package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class secondlargest
{
	public static void main(String arg[]) throws NumberFormatException, IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter size of array");
	int size=Integer.parseInt(br.readLine());
	int[] a=new int[size];
	int m=0,n=0;
	int i=0;
	System.out.println("enter the array");
	for( i=0;i<size;i++)
	{
		a[i]=Integer.parseInt(br.readLine());
	if(a[i]>m)
	{
		n=m;
		m=a[i];
	}
	else if(a[i]>n)
	{
		n=a[i];

	}	
	}
	System.out.println("enter second largest=:"+n);
}
}
