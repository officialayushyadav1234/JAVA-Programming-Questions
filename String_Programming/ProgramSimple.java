package String_Programming;

public class ProgramSimple {

    public static void main(String[] args) {
        
        String s1 = "mohan is here";
        System.out.println(s1.length());
        System.out.println(s1.toUpperCase());

        String s2 = null;
        System.out.println(s2);
        char p='\0';
        System.out.println(p);

        String s3 = "mohan";
        System.out.println("S3 Length" +s3.length());
        s3 = s3+'\0';
        System.out.println("S3 Length :" +s3.length());
        System.out.println("s3 is :"+s3);

    }
}
