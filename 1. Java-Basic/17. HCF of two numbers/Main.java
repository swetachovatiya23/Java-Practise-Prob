//HCF of Two Numbers: Find the highest common factor (HCF) of two numbers.

import java.util.*;

public class Main{
    public static int hcf(int num1, int num2){
        if(num2 != 0){
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
    public static void main(String args[]) {
        //scanner class
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number : "); 
        int num2 = sc.nextInt();

    }
}