//calculate the sum of elementsin Array

import java.util.*;
public class Main{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        //Num of digits in array
        System.out.println("Enter the number of elements in array : ");
        int n = scanner.nextInt();

        //array elements
        System.out.println("Enter the elemets of array : ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }


        //1. initialise variable to store the value
        int sum = 0;

        //2. iterate 
        for(int i=0; i<n; i++) {
            sum += arr[i];
        }
        System.out.println("sum : " + sum);

    }
}

