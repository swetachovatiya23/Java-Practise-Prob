//Prime Numbers in Range: Print all prime numbers in a given range.

import java.util.*;

public class Main{
    public boolean isPrime(int num){
        if(num <=1) {
            return false;
        }
        for(int i = 2; i < num; i++){
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        //scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the start of a range : ");
        int start = scanner.nextInt();

        System.out.println("Enter the end of the range : ");
        int end = scanner.nextInt();

     



    }
}