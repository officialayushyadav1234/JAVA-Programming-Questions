package Array_Programming;

import java.util.Scanner;
public class EvenOrOdd {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		String[] k= {"Even", "Odd"};
		System.out.println("The Number is:" +k[n%2]);
	}
}
