package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class add
{
	public static void main(String arg[]) throws NumberFormatException, IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter size of array");
	int size=Integer.parseInt(br.readLine());
	int[] a=new int[size];
	int[] b=new int[size];
	for(int i=0;i<size;i++)
	{
		System.out.println("enter 1 array");
		a[i]=Integer.parseInt(br.readLine());
	}
		for(int i=0;i<size;i++)
		{
			
			System.out.println("enter 2 array");
			b[i]=Integer.parseInt(br.readLine());
		}
			for(int i=0;i<size;i++)
			{
				System.out.println(a[i]+b[i]);
			}
		}
		
	}
	
			
