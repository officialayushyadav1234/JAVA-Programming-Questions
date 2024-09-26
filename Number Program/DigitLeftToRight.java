//package number_program;
import java.util.Scanner;
public class DigitLeftToRight
 {
	public static void main(String[] args)
          {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();		int a=n;
		int count=0;
		while(n>0)
		          {
			   count++;
		           n=n/10;
		          }
		while(count>0)
		             { 
		 	       int digit=(int)(a/Math.pow(10, count-1) )%10;
			       System.out.println(digit);
		               count--;
	                     }
          }
}




