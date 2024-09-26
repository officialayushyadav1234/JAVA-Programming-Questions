import java.util.Scanner;
class RecursionBig 
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd Number:");
        int b = sc.nextInt();
        System.out.println("Enter the 3rd Number:");
        int c = sc.nextInt();
        System.out.println("Enter the 4th Number:");
        int d = sc.nextInt();
        System.out.println("Enter the 5th Number:");
        int e = sc.nextInt();
        System.out.println("Biggest is : "+big(big(big(a,b),c),big(d,e)));
     }

    public static int big(int a, int b)
     {
        return a > b ? a : b;
     }
}