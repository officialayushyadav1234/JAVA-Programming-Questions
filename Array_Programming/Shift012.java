package Array_Programming;

import java.util.Scanner;
public class Shift012 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Length:");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<a.length; i++)
		{
			System.out.println("Enter the Element"+(i+1)+": ");
			a[i] = sc.nextInt();
		}
		shift(a);
	}
	
	public static void shift(int[] a)
	{
		int[] a3=new int[3];
		for(int i=0; i<a.length; i++)
		{
			a3[a[i]]++;
		}
		for(int i=0; i<3; i++)
		{
			int len=a3[i];
			for(int j=0; j<len; j++)
			{
				System.out.print(i+" ");
			}
		}
	}
}
