//Substring Search: Check if a substring exists in a string.

import java.util.*;

public class Main{
    public static void main(String args[]){
        //scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = scanner.nextLine();

        System.out.println("Enter the substring you want : ");
        String subStr = scanner.nextLine();

        if(str == subStr){
            System.out.println("Substring exists in String");
        }else {
            System.out.println("String doesn't have Substring");
        }
        
    }
}