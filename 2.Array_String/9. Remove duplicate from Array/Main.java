//Remove the duplicate from array

import java.util.*;

public class Main{
    public static void duplicate(int[] array){

    }
    public static void main(String args[]){
        //scanner class
        Scanner scanner = new Scanner(System.in);

        //prompt input element
        System.out.println("Enter the digit of array element: ");
        int n = scanner.nextInt();

        //define the array for given size
        int[] array = new int[n];

        //prompt input array element
        for(int i=0; i<n; i++){
            array[i] = scanner.nextInt();
        }

        

    }
}