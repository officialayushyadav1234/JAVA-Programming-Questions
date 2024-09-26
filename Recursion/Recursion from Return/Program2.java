class Program2
{
	public static void main(String[] args)
	{
		System.out.println("main method starts");
		int x=test(4);
		System.out.println("x is: "+x);
		System.out.println("main method ends");
		
	} 
	public static int test(int x)
	{
		if(x>1){
			System.out.println("This is test method");
			return test(x-1);
		}
		else{
			return 5;
		}
	}
}