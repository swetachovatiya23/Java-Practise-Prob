//Palindrome Check: Check if a number is a palindrome.

import java.util.*;

public class Main {

    public static boolean isPlalindrome(int number) {
        //negative numbers are not palindrome
        if (number < 0) {
            return false;            
        }

        //find the divisor to extract the first digit
        int divisor = 1;
        while(number / divisor >= 10) {
            divisor *= 10;
        }
        while(number != 0); // this line starts a loop that continues until the entire number is processed. 

        int leading = number / divisor; //Extract leading digit
        int trailing = number % 10; //extract trailing digit

        if(leading != trailing) {
            return false;
        }

        number = (number % divisor) / 10;
        divisor /= 100;

        return true;
    }
    public static void main(String args[]) {
        //scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = scanner.nextInt();

    }
}