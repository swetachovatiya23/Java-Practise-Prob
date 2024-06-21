//Check if two strings are anagrams.

import java.util.*;

public class Main{
    public static boolean isAnagrams(String str1, String str2){
        //check length
        if(str1.length() != str2.length()){
            return false;
        }
    }
    public static void main(String args[]){
        //scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first string : ");
        String str1 = scanner.nextLine();

        System.out.println("Enter second String : ");
        String str2 = scanner.nextLine();


    }
}