//String Palindrome

import java.util.*;

public class Main{
    public static String palindrome(String str){
        StringBuilder sb = new StringBuilder();
        return sb.reverse().toString();
    }
    public static void main(String args[]){
        //scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = scanner.nextLine();

        //output
        if(palindrome(str) == str){
            System.out.println("It is Palindrome");
        }else{
            System.out.println("It's not palindrome");
        }
        scanner.close();
    }
}