//Array Sorting: Sort an array using bubble sort.

import java.util.*;

public class Main{
    public static void main(String args[]){
        //scanner class 
        Scanner scanner = new Scanner(System.in);

        //prompt input for total array elements
        System.out.println("Enter the Array element digit : ");
        int n = scanner.nextInt();

        //defining array for given size
        int[] arr = new int[n];

        //prompt input for array elemts
        System.out.println("Enter the array elemnts: ");
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        //sorting array
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        scanner.close();


    }
}