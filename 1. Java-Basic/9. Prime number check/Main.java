////Prime Number Check: Determine if a number is prime.

import java.util.*;

public class Main{
    public static boolean isPrime(int number) {
        if(number <= 1) {
            return false;
        }
        
        //chcek from 2 to n-1
        for(int i = 2; i < number; i++) {
            if(number % i == 0){
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