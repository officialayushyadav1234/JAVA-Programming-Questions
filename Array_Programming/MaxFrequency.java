package Array_Programming;

import java.util.Scanner;
public class MaxFrequency 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int size;
		
		do {
			System.out.println("Enter the Size:");
			size=sc.nextInt();
			if(size>0)
			{
			  int[] a=new int[size];
			  for(int i=0; i<size; i++)
			  {
				  System.out.println("Enter the "+(i+1)+ "Element: ");
				  a[i]=sc.nextInt();			  
			}
			getMaxFrequency(a);
			}
		else
			System.out.println("This is Invalid Size");
	} while(size<=0);
}

public static void getMaxFrequency(int[] k)
{
	int n=k.length;
	int value=0;
	int max_freq=0;
	for(int i=0; i<n; i++)
	{
		int count = 1;
		for(int j=i+1; j<n; j++)
		{
			if(k[i] == k[j])
			{
				count++;
				k[j]=k[n-1];
				n--;
				j--;
			}
		}
		if(count>max_freq) {
			max_freq=count;
			value=k[i];
		}
	}
	System.out.println("Highest freq is: "+max_freq+ "And element is:"+value);
}
}