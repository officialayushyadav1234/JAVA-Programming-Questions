//package number_program;
import java.util.Scanner;
public class CountBit
 {
	public static void main(String[] args) 
             {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		int count=0;
		while(n>0)
		{
			count++;
		n=n/2;
		}
		System.out.println("Total Bits are: "+count);
		
	    }

}