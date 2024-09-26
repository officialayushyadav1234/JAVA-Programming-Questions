package String_Programming;

import java.util.Scanner;

class checkStringDigits {

   public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String: ");
    String s1 = sc.nextLine();
    checkString(s1);
   }  
   
   public static String checkString(String s1 ) {
       for(int i=0; i<s1.length(); i++) {
           if(s1.charAt(i) == '0' && s1.charAt(i) <= '9') {
           return "String does not contans only Digits";
           }
        }
      
     return"It is contains Only ";
    }
   
}

