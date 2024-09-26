class Program3 {
  public static void main(String[] args) {
    System.out.println("This is main Method");
    test(1);
    System.out.println("Ends Main Method");
  }

  public static void test(int x) {
    System.out.println("This is Test Method" + x);

    if (x <= 100) // But if statement print 101 times
    {
      test(x + 1);
    }
  }
}