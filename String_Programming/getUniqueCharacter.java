package String_Programming;

import java.util.Scanner;

public class getUniqueCharacter {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter the String : ");
        String s1 = sc.nextLine();
        getUniqueCharacter(s1);
    }

    public Static void getUniqueCharacter(String s1){
        int count = 0;
        int[] p = new int[256];
        for(int i=0; i<s1.length(); i++){
            p[s1.charAt(i)]++;
        }
        for(int i=0; i<p.length; i++){
            if(p[i] == 1)
            System.out.println((char)i);
            count++;
        }
    }
    System.out.println("Total Unique Characters are: "+count);
}

