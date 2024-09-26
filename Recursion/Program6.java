class Program6
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
              
    if(x<=2)      // But if stsement print 101 times     
           {
             test(x+1);
           }
    else {
          System.out.println("Outside if x is:"+x);
         }
    System.out.println("This statement is out of if else and x is: "+x);
  }
}