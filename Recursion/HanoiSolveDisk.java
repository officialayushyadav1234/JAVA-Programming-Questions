import java.util.Scanner;
class HanoiSolveDisk
{
 
 static int count = 0;
 
 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number:");
  int n=sc.nextInt();
  getmoves(n,'A','B','C');
  System.out.println("Total moves:"+count);
  }
 public static void getmoves(int n,char s,char d,char h)
  {
    count++;
    if(n==1)
   {
    System.out.println("Moves disk" +n+ " from " +s+ " To " +d);
    return;
   }
    getmoves(n-1,s,h,d);
    System.out.println("Moves disk" +n+ " from " +s+ " To " +d);
    getmoves(n-1,h,d,h);
 
  }
}  