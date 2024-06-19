//Find smallest from given array

import java.util.*;

public class Main{
    public static void main(String args[]){
        //scanner class
        Scanner scanner = new Scanner(System.in);

        //prompt array elemts
        System.out.println("Enter the total number of elements: ");
        int n = scanner.nextInt();

        //defining new array for given size
        int[] array = new int[n];

        //prompt array elements
        System.out.println("Enter the array elements: ");
        for(int i=0; i<n; i++) {
            array[i] = scanner.nextInt();
        }

        
    }
}