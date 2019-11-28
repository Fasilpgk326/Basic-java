package Programming;
import java.util.Scanner;

public class palistring {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		 String str=s.next();
		 int l=str.length();
		 String b="";
		 for(int i=l-1;i>=-0;i--)
		 {
		 b=b+str.charAt(i);
		 }
		 System.out.println(b);
	
	if(str.equals(b))
		
	{
		System.out.println("is a palindrom");
	}
	else
	{
	    System.out.println("is not a palindrom");
	}  
	

}}
