package String_Programming;

public class Program3 {
    
    public static void main(String[] args) {
        
        String s1 = new String ("mohan");
        String s2 = new String("rohan");

        String s4 = "rohan";
        String s5 = s2;
        s4 = "John";
        String s6 = new String("John");

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        System.out.println(s2==s5);
        System.out.println(s2.equals(s5));

        System.out.println(s2==s4);
        System.out.println(s2.equals(s4));

        System.out.println(s4==s6);
        System.out.println(s4.equals(s6));        
    }
}
