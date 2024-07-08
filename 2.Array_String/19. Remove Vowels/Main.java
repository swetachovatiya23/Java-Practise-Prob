//Remove Vowels: Remove all vowels from a string.

import java.util.*;

public class Main{
    public static String removeVowels(String str){
        StringBuilder noVowels = new StringBuilder(); //using string builder to build result efficiently

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(!isVowel(c)){
                noVowels.append(c); //Append no vowel charecter
            }
        }
        return noVowels.toString();
    }

    public static boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c) != -1;
    }
    public static void main(String args[]){
        //scanner class
        Scanner scanner = new Scanner(System.in);

        //Prompt input string
        System.out.println("Enter the input String : ");
        String str = scanner.nextLine();

        //function to remove vowels
        String result = removeVowels(str);

        //Display the result
        System.out.println("String after removing the vowels : " +result);

        scanner.close();
         //Display the result
         System.out.println("String after removing the vowels : " +result);

          //Display the result
        System.out.println("String after removing the vowels : " +result);


        
    }
}