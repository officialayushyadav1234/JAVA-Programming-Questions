class Program1
{
	public static void main(String[] args)
	{
		System.out.println("main method starts");
		test();
		System.out.println("main method ends");
		
	} 
	public static int test()
	{
		System.out.println("This is test method");
		
	return test();
	}
}