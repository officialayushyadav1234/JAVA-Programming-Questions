import java.util.Scanner;
class RightInvertedPyramid
{
  public static void main(St ring [] args)
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    int n= sc.nextInt();
    System.out.println();
    printPattern(n);
   }
  public static void printPattern(int n)
  {
   int star=1;
   for(int i=1; i<=n; i++)
   {
     for(int j=1; j<=star; j++)
     {  
      System.out.print("* ");
      if( i<(n/2)+1)
        star++; 
      else
        star--;
       }
    System.out.println();
   }
 }
}
        