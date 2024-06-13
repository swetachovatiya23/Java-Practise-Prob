// Fibonacci Series: Print the first N numbers of the Fibonacci series.

import java.util.*;

public class Main{
    public static void fibonacci(int num){
        int firstNum = 0;
        int secondNum = 1;

        if(num >= 1){
            System.out.println(firstNum + " ");
        }
        if(num >= 2){
            System.out.println(secondNum + " ");
        }
        for (int i = 3; i<= num; i++) {
            int nextNum = firstNum + secondNum;
            System.out.println(nextNum + "");

            firstNum = secondNum;
            secondNum = nextNum; 
        }

    }

    public static void main(String args[]){
        //scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to get it's fibonacci : ");
        int num = scanner.nextInt();

        //print fibonacci
        System.out.print("Fibonacci of " + num + " is ; ");
        fibonacci(num);

        scanner.close();



    }
}