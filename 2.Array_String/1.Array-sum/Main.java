//calculate the sum of elementsin Array

import java.util.*;
public class Main{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in array : ");
        int n = scanner.nextInt();

        System.out.println("Enter the elemets of array : ");
        int[] arr = new int[n];


        //1. initialise variable to store the value
        int sum = 0;

        //2. iterate 
        for(int i=1; i<arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("sum : " + sum);

    }
}

