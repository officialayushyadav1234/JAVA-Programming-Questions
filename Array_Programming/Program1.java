package Array_Programming;

public class Program1 {

	public static void main(String [] args)
	{
		int[] x = {12,18,10,15,30};
		double[] y = {12.6,25.5,18,33,54,15.8,45.9,30.54};
		
		System.out.println(x);
		System.out.println(y);
		System.out.println("The Size of array is : "+y.length);
		System.out.println(x[2]);
		System.out.println(x[2]+y[3]);
		System.out.println(x[7]);     // ArrayIndexOutOfBound Error
	}
}
