import java.util.Scanner;
class MatrixProgram1
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();

    printPattern(n);
  }

  public static void printPattern(int n) 
  {

    for (int i = 1; i <= n; i++) 
     {
      for (int j = 1; j <= n; j++)
        {
          System.out.print("(" + i + "," + j + ") ");
        }
      System.out.println();
    }
  }
}