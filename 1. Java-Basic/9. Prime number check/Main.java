////Prime Number Check: Determine if a number is prime.

import java.util.*;

public class Main{
    public static boolean isnotPrime(int a) {
        return a % 2 == 0;
    }
    public static boolean isPrime(int a) {
        return !isnotPrime(a);
    }


    public static void main(String args[]) {
        //scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        if(isPrime(num)) {
            System.out.println(num + " is prime number");
        }else {
            System.out.println(num + " is not prime number");
        }
        scanner.close();

    }
}