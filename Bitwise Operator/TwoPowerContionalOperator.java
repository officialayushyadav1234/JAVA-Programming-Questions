import java.util.Scanner;
class TwoPowerContionalOperator
{
 public static void main(String[]args)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the Number:");
  int n=sc.nextInt();
  
  String result = ((n & (n-1))==0) ? "The Number is 2's power" : "The number is not 2's power";
  System.out.println(result);
 }
}