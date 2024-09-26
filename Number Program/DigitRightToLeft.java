//package number_program;
import java.util.Scanner;
public class DigitRightToLeft 
 {
	public static void main(String[] args)
            {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		while(n>0)
		{
			System.out.println(n%10);
		  n=n/10;
		 }
	}
}