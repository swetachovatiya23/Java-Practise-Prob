//determine if a year is a leap year

import java.util.*;

public class Main{

    public static boolean isLeapYear(int year){
        //leap year is divisible by 4
        //but not divisible by 100 unless divisible by 400
        if(year % 4 == 0){
            if(year % 100 == 0) {
                    return year % 400 == 0;
                } else {
                    return true;
                }
            }else {
                return false;
        }
        
    }
    public static void main(String args[]) {
        //scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year : ");
        int year = scanner.nextInt();

        //determine if the year is leap year or not

        if(isLeapYear(year)) {
            System.out.println(year + " is a leap year");
        }else {
            System.out.println(year + " is not a leap year");
        }

        scanner.close();


    }
}