//String to Integer Conversion: Convert a string to an integer.

import java.util.*;

public class Main{
    public static int converStringToInt(String str) throws NumberFormatException {
        return Integer.parseInt(str);
    }
    public static void main(String args[]){
        //scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String represnting as integer : ");
        String str = scanner.nextLine();

        try {
            //convert a string to an integer
            int result = converStringToInt(str);

            //output the result
            System.out.println("The integer value is : " + result);
        } catch (NumberFormatException e) {
            System.out.println("The Input is not a valid integer");
        }
        scanner.close();
    }
}