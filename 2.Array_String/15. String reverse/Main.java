//Reverse the string

import java.util.*;

public class Main{
    public static String reverse(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static void main(String args[]){
        //scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your string : ");
        String str = scanner.nextLine();

        //print reverse
    }
}