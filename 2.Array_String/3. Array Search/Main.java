//Array Search: Search for an element in an array.

import java.util.*;

public class Main{
    public static void main(String args[]){
        //scanner class
        Scanner scanner = new Scanner(System.in);

        //prompt for array digits input
        System.out.println("Enter the array element digit : ");
        int n = scanner.nextInt();

        //craete an array of specifies size
        int[] arr = new int[n];

        //prompt for array elements
        System.out.println("Enter the array elements : ");
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
    }
}