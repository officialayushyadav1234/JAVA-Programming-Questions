package String_Programming;

public class Program2 {
    public static void main(String[] args) {
        
        String s1= new String("Mohan");
        String s2= new String("Mohan");

        String s3 = "Rohan";
        String s4 = "Rohan";
        System.out.println(s1==s2);
        System.out.println(s3==s4);
        System.out.println(s1==s3);
        
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}
