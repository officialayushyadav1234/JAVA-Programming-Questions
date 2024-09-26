//package number_program;
public class Swap
 {
	public static void main(String[] args)
          {
		int a=12;
		int b=18;
		System.out.println("Before Swapping: ");
		System.out.println("a is: "+a);
		System.out.println("b is: "+b);
		b=a+b;
		a=b-a;
		b=b-a;
		System.out.println("After Swapping: ");
		System.out.println("a is: "+a);
		System.out.println("b is: "+b);
		
	   }

}