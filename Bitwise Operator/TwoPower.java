import java.util.Scanner;
class TwoPower
{
 public static void main(String[]args)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the Number:");
  int n=sc.nextInt();
  
  int countX=0;
  int count=0;
  while(n!=0)         // or (n>0)
  { 
       countX++;
         if((n&1)==1)
           count++;
   n=n>>>1;
   }
   if(count==1)
      System.out.println("This number is 2's power");
   else
      System.out.println("This number is not 2's power");
}
}