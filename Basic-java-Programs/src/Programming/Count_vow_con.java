package Programming;
import java.util.Scanner;

public class Count_vow_con {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string :");
	    String str=s.next();
	    int vow=0,cons=0;
	    
	    for(int i=0;i<str.length();i++)
	    {
	    	char c=str.charAt(i);
	    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
	    {
	    	vow++;
	    }
	    else
	    {
	    	cons++;
	    }
	    
	}
	    System.out.println("vowel:"+vow);
	    System.out.println("consonent:"+cons);

}}
