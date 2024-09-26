package String_Programming;


import java.util.Scanner;

public class BiggestWordString {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s1 = sc.nextLine();
        biggestWordString(s1);
    }

    public static void biggestWordString(String s1){

        String bigWord = "";
        String word = "";
        for(int i=0; i<s1.length(); i++){
           char x = s1.charAt(i);
           if(x != ' ')
           word = word+x;

           if(x == ' ' && ! word.isBlank() || i == s1.length()) {

             if(word.length() > bigWord.length()) {
               bigWord = word;
             }
             word = "";

           }
        }
        System.out.println("The Biggest Word is :" +bigWord);
    }
}
