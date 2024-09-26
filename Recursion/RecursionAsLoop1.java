class RecursionAsLoop1
{
 public static void main(String[] args)
 {
     test(1); 
 }
  
  public static void test(int x)
    {
      if(x<=10)
        {
            System.out.println(x+" ");
            test(x+1);
         }
    }
}