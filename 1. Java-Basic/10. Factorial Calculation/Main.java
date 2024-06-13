//Calculate the factorial of a number

import java.util.*;

public class Main{
    public static long factorial(int num) {
        long result = 1;
        for(int i = 1; i<= num; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String args[]){
        //scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number : ");
        int num = scanner.nextInt();

        //calculate fctorial
        long factorialsum = factorial(num);

        System.out.println("Factorial of " + num + " is " + factorialsum);

        scanner.close();

    }
}