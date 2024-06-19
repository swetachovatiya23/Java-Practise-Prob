//Find largest in Array

import java.util.*;

public class Main{
    public static void largest(int large) {

    }
    public static void main(String args[]) {
        //scanner class
        Scanner scanner = new Scanner(System.in);

        //prompt number of array elemt
        System.out.println("Enter the number of array elements : ");
        int n = scanner.nextInt();

        //defininig Array of given size
        int[] array = new int[n];

        //prompt array element
        System.out.println("Enter the elemts for array: ");
        for(int i=0; i<n; i++){
            array[i] = scanner.nextInt();
        }

        //getting empty variable to store lagest value
        int largestValue = Integer.MIN_VALUE;

        //itrate through array and find largest elemet
        for(int i=0; i<n; i++){
            if(array[i] > largestValue){
                largestValue = array[i];
            }
        }
        //print largest element 
        System.out.println("The largest element is : " + largestValue);
        scanner.close();
    }

}