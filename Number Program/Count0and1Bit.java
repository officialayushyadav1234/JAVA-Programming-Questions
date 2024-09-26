//package number_program;
import java.util.Scanner;
public class Count0and1Bit
 {
	public static void main(String[] args)
            {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		int bit0=0;
		int bit1=0;
	      while(n>0)
	             {
			int rem=n%2;
			if(rem==0)
				bit0++;
			else
				bit1++;
                		n=n/2;
 		     }
		System.out.println("Total 0 Bits are: "+bit0);
		System.out.println("Total 1 Bits are: "+bit1);
	}

}