//get the avg of given array

import java.util.*;

public class Main{
    public static void main(String args[]){
        //scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in given array : ");
        int n = scanner.nextInt();
         
        //create an array of specified size
        int[] arr = new int[n];

        //prompt user to enter the elemets of the array
        System.out.println("Enter the elemts of array : ");
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        //get the sum of array
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];
        }

        //get avg
        double avg = (double) sum / n;

        System.out.println("Avg of array is : " + avg);

        scanner.close();

    }
}