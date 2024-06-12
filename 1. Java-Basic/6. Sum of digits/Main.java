//Calculate the sum of the digits of a number.

import java.util.*;

public class Main{


    public static int sumOfdigits(int a){
        int sum = 0;
        while(a != 0) {
            sum = sum + a % 10; //add thelastdegit to the sum
            a = a/10; //remove the last digit
        }
        return sum;
    }
    public static void main(String args[]){
        //scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int a = scanner.nextInt();

        int sum = sumOfdigits(a);

        System.out.println("Sum of all given digits are : " + sum);

        scanner.close();




    }
}