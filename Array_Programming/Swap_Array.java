package Array_Programming;

import java.util.Scanner;
public class Swap_Array {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[] a = {17,16,101,127,141,377,437};
		System.out.println("Enter the Index1 : ");
		int x=sc.nextInt();
		System.out.println("Enter the Index2 : ");
		int y= sc.nextInt();
		
		swapNum(a,x,y);
		for(int p:a)
		{
			System.out.print(p+" ");
		}
	}
	public static void swapNum(int[] k, int x,int y)
	{
		k[x]=k[x]+k[y];
		k[y]=k[x]-k[y];
		k[x]=k[x]-k[y];
	}
}
