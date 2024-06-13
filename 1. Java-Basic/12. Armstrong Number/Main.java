//Armstrong Number: Check if a number is an Armstrong number.

import java.util.*;

public class Main{

    public static boolean isArmstrong(int num){
        int origionalNum = num;
        int sum = 0;
        int numberOfDigits = String.valueOf(num).length(); //chnaging num into string bcz we can only interate throught string not numbers

        while( num != 0) {
            int digit = num % 10; //to get the last digit of
            sum += Math.pow(digit, numberOfDigits); // each digits of num will have the length of num as a power
            num /=10; //to remove the last digit of num 
        }
        return sum == origionalNum;
    }
    public static void main(String args[]){
        //scanner class
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();


    }
}