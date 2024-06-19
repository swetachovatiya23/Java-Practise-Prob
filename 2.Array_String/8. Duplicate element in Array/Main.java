//Find duplicate from array

import java.util.*;

public class Main{
    public static void main(String args[]){
        //scanner class
        Scanner scanner = new Scanner(System.in);

        //propmpt array element
        System.out.println("Enter the value of an element: ");
        int n = scanner.nextInt();

        //define array 
        int[] array = new int[n];

        //propmt array elements
        System.out.println("Enter the value of array elemts : ");
        for(int i=0; i<n; i++){
            array[i] = scanner.nextInt();
        }
    }
}