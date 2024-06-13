//Calculate the factorial of a number

import java.util.*;

public class Main{
    public static long factorial(int num) {
        long result = 1;
        for(int i = 0; i<= num; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String args[]){
        //scanner class
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        //calculate fctorial
        long factorialsum = factorial(num);

    }
}