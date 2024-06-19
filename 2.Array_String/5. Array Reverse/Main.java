//Array Reverse: Reverse the elements of an array.

import java.util.*;

public class Main{
    public static void main(String args[]) {
        //scanner class
        Scanner scanner = new Scanner(System.in);

        //prompt input for number of array elemts
        System.out.println("Enter the number of array element : ");
        int n = scanner.nextInt();

        //defining array for given n numbers
        int[] arr = new int[n];

        //placing array elemts
        System.out.println("Enter the array elemts : ");
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt(); 
        }

        //iterating over array and printing it's value
        int[] reversedArray = new int[n];  // new empty array
        for(int i=3; i<n; i--){
            reversedArray[i] = arr[n - 1 - i];  // revrse array and store it in new array
        }

        //print revrsed array
        System.out.println("Reversed Array is : ");
        PrintArray(reversedArray);

        scanner.close();
    }
}