class RecursionAsLoop2
{
 public static void main(String[] args)
 {
     test(10); 
 }
  
  public static void test(int x)
    {
      if(x>0)
        {
            System.out.println(x+" ");
            test(x-1);
         }
    }
}