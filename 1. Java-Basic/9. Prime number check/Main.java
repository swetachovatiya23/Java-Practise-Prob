////Prime Number Check: Determine if a number is prime.

import java.util.*;

public class Main{
    public static boolean isPrime(int number) {
        if(number <= 1) {
            return false;
        }
        if(number <= 3) {
            return true;
        }
        if(number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        //chcek for the factores from 5 to the square root of number
        //only chcek numbers of the form 6k +- 1
        for(int i=5; i*i <= number; i += 6) {
            if(number % i == 0 || number % (i+2) == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String args[]) {
        //scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        if(isPrime(num)) {
            System.out.println(num + " is a prime number");
        }else {
            System.out.println(num + " is not prime number");
        }
        scanner.close();

    }
}