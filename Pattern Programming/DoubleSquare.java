import java.util.Scanner;
class DoubleSquare
{
  public static void main(String [] args)
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    int n= sc.nextInt();
    System.out.println();
    printPattern(n);
   }
  public static void printPattern(int n)
  {
   for(int i=1;i<=n;i++)
   {
     for(int j=1;j<=n;j++)
      {
       if(i==1 ||i==2 ||i==n||i==n-1 ||j==1||j==2||j==n||j==n-1 ||i==(n/2)+1 && j==(n/2)+1) 
	   System.out.print("* ");
       else
	  System.out.print("  ");

      }
    System.out.println();
   }
  }
}
    