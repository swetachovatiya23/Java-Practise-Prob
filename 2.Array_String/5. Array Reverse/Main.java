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
    }
}