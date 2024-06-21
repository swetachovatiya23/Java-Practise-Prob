//Check if two strings are anagrams.

import java.util.*;

public class Main{
    public static boolean isAnagrams(String str1, String str2){
        //check length
        if(str1.length() != str2.length()){
            return false;
        }
        
        //create array to count the frequency
        int[] charCount = new int[256];

        //count charecter in the first string
        for(int i=0; i< str1.length(); i++){
            charCount[str1.charAt(i)]++;
        }

        //substract the count for character in the second string
        for(int i=0; i<str2.length(); i++) {
            charCount[str2.charAt(i)]--;
        }

        //check if all counts are zero
        for(int count : charCount) {
            if(count != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        //scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first string : ");
        String str1 = scanner.nextLine();

        System.out.println("Enter second String : ");
        String str2 = scanner.nextLine();

        //chcek if the strings are anagrams
        boolean result = isAnagrams(str1, str2);

        //print the result
        System.out.println(result ? "Yes it is Anagram" : "No it is not Anagram");

        scanner.close();

    }
}