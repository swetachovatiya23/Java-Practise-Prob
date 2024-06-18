//Array Sorting: Sort an array using bubble sort.

import java.util.*;

public class Main{
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        boolean swapped;

         //sorting array
         for(int i=0; i<n-1; i++){
            swapped = false;
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
            break;
        }

    }
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
        bubbleSort(arr);

        //outut 
        System.out.println("Sorted array : ");
        for(int i=0; i<n; i++){
            System.out.println(arr[i] + " ");
        }

       
        scanner.close();


    }
}