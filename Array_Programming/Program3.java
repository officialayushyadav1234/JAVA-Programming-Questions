package Array_Programming;

public class Program3 {

	public static void main(String[] args)
	{
		double[] y = {12.6,25.5,18,33,54,15.8,45.9,30.54};
		
		getElements(y);
	}
	
	public static void getElements (double[] p)
	{
		for(double k:p)
		{
			System.out.println(k);
		}
	}
}
