// Number Triangle

import java.util.Scanner;
class NumberPattern2
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
       int x=1;
       String s1=" ";

      for(int i=1; i<=n; i++)
      {     
        for(int j=1; j<=n; j++)
          {
            if(i+j<n+1) {
               System.out.printf("%4s",s1); 
               }
            else {
               System.out.printf("%4d",x);
               x++; }
           }
       System.out.println();
       }
    }
}  