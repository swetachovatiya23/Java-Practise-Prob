//Remove the duplicate from array

import java.util.*;

public class Main{
    public static void removeDuplicate(int[] array){
        int length = array.length;

        for(int i=0; i<length; i++){
            for(int j=i+1; j<length; j++){
                if(array[i] == array[j]){
                    
                    //shift the element to overwrite duplicate
                    for(int k = j; k < length-1; k++){
                        array[k] = array[k + 1];
                    }
                    length--; //length will decrement
                    
                }else {
                    newArray = array[i];
                }
            }
        }
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