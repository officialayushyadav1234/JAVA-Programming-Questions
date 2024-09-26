import java.util.Scanner;
class BigNumberDoLoop
{
 public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the 1st number:");
   int a= sc.nextInt();
   int big=a;
   char c;
   
   do{
       System.out.println("Enter the next Number:");
       int b=sc.nextInt();
       big = getBig (big, b);
       System.out.println("Press Y/y to Enter Next Number:");
       c = sc.next().charAt(0);
      
      } while ( c=='Y' || c=='y');
        System.out.println("The Biggest Number is:"+big);   
   }
 public static int getBig(int a, int b)
   {
     return a>b?a:b;
    }
}