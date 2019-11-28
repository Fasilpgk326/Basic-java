package Programming;
import java.util.Scanner;

public class dectooct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s=new Scanner(System.in);
      int dec=s.nextInt();
      
      int bin=0,r1,r2;
      int oct =0;
      int i=0;
      while(bin!=0)
      {
    	  r1=dec%10;
    	  bin=bin+(int)(r1*Math.pow(2, i));
    	  dec/=10;
    	  i++;
     }
      System.out.println(dec);
      i=1;
      while(dec!=0)
      {
    	  r2=dec%8;
    	  oct+=r2*i;
    	  dec=dec/8;
    	  i=i*10;
      }
      System.out.println("octal num is"+oct);
      }
	}



