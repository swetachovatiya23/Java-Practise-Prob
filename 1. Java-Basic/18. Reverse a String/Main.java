//Reverse a string

import java.util.Scanner;

public class Main{
    public static String reveString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    public static void main(String args[]){
        //scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String str = scanner.nextLine();



    }
}