package String_Programming;

public class Program4 {
    public static void main(String[] args) {
        
        char[] x = {'m','o','h','a','n',' ','i','s'};

       String s1 = new String(x);
       String s2 = new String(x,2,5);

       System.out.println("S1 is :" +s1);
       System.out.println("s2 is :" +s2);
    }
}
