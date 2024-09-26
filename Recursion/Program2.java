class Program2
{
 public static void main(String[] args)
 {
   System.out.println("This is main Method");
   test(1);
   System.out.println("Ends Main Method");
 }
 public static void test(int x)
  {
    System.out.println("This is Test Method"+x);
    test(x+1);
  }
}