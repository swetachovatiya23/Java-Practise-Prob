//Substring Search: Check if a substring exists in a string.

import java.util.*;

public class Main{
    public static boolean subString(String str, String subStr){
        return str.contains(subStr);
    }
    public static void main(String args[]){
        //scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = scanner.nextLine();

        System.out.println("Enter the substring you want : ");
        String subStr = scanner.nextLine();

        //check if the substring exists in the main string
        boolean result = subString(str, subStr);

        //output
        if(result){
            System.out.println("Substring exists in String");
        }else {
            System.out.println("String doesn't have Substring");
        }
        scanner.close();
        
    }
}