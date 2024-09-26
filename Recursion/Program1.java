class Program1
{
 public static void main(String[] args)
 {
   System.out.println("This is main Method");
   test();
   System.out.println("Ends Main Method");
 }
 public static void test()
  {
    System.out.println("This is Test Method");
    test();
  }
}