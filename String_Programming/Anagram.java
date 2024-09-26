package String_Programming;

import java.util.*;
class Anagram {

     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String:");
        String s1 = sc.nextLine();
        System.out.println("Enter the Second String:");
        String s2 = sc.nextLine();
        
        if(checkAnagram(s1,s2))
        System.out.println("The String are Anagram!");
        else
        System.out.println("String are Not Anagram!");

    }
    
    public static boolean checkAnagram(String s1, String s2){
            
        int[] count1 = getcount(s1);
        int[] count2 = getcount (s2);

        for(int i=0; i<count1.length; i++){
           if(count1[i]!= count2[i])
           return false;
        }
        return true;
     }

    public static int[] getcount(String s){
        
        int[] count = new int[26];
        
        for(int i=0; i<s.length(); i++){
            char x = s.charAt(i);
            if(x>=65 && x<=122)
            count[x-97]++;
        }
        return count;
    }
}