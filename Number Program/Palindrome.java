//package number_program;
import java.util.Scanner;
public class Palindrome
 {
	public static void main(String[] args)
           {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();	
		if(checkPalindrome(n))
			System.out.println("It is a Palindrome Number");
		else
			System.out.println("It is not a Palindrome Number");
	    }
	public static boolean checkPalindrome(int n)
	    {
		int p=n;
		int count=getCount(n);	int x=count;
		int i=1;
		while(i<=x/2)
		{
			int r=p%10;
			int l=(int)(n/Math.pow(10, count-1))%10;
			if(l!=r)
				return false;
		p=p/10;
		count--;
		i++;
		}
	return true;
	}
	public static int getCount(int n)
	{
		int count=0;
		while(n>0){
			count++;
			n=n/10;
		}
		return count;
	}

}