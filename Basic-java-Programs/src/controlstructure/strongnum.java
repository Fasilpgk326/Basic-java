package controlstructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class strongnum {
	public static void main(String arg[]) throws NumberFormatException, IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter value");
	System.out.println();
	int n=Integer.parseInt(br.readLine());
	int f,s=0,r,num=n;
	while(n!=0)
	{
	f=1;
	r=n%10;
	for(int i=1;i<=n;i++)
	{
		f=f*i;
	}
	s=s+f;
	n=n/10;
	}
	if(s==num)
	{
	System.out.println("the strong num");
	}
	else
	{
		System.out.println("not strong num");
	}
}
}
