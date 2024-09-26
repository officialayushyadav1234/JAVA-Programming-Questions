import java.util.Scanner;
class Factorial
{
	public static void main(String[] args)
	{
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number: ");
         int n = sc.nextInt();
         System.out.println(n+ "!=" +getFactorial(n));
        }
      
       public static int getFactorial(int n)
        {
           if(n>1) 
                 return n*getFactorial(n-1);
            else 
                 return n;
        }
}    
