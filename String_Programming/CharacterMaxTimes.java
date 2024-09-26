package String_Programming;

import java.util.Scanner;

public class CharacterMaxTimes {
 
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String:");
        String s1 = sc.nextLine();
        getCharactor(s1);

    }

    public static void getCharactor(String s1){

        int max = 0;
        char max_char=' ';
        int[] p = new int[256];
        for(int i=0; i<s1.length(); i++)
            p[s1.charAt(i)]++;
        
        for(int i=0; i<p.length; i++){
            if(p[i] > max)
            max_char=(char)i;
            max = p[i];
        }
        System.out.println("maximum frequency charactor is:" +max_char);
    }
}
