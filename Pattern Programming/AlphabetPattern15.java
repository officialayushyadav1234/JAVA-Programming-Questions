// Alphabet Triangle

import java.util.Scanner;
class AlphabetPattern15
{
  public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number:");
  int n=sc.nextInt();
 System.out.println();
  
   printPattern(n);
  }
 public static void printPattern(int n)
   {
       int x=65;
      for(int i=1; i<=n; i++)
      {
        
        for(int j=1; j<=i; j++)
          {
            System.out.print((char)x+" "); 
            x++;
           }
       System.out.println();
       }
    }
}  