package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class largest
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
	if(a[i]>=m)
	{
		
		m=a[i];
	}
		
	}
	System.out.println("largest=:");
	System.out.println(m);
	
}
}



