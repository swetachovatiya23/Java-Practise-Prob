//Find duplicate from array

import java.util.*;

public class Main{
    public static void findAndPrintDuplicates(int[] array) {
        // Set to store unique elements
        Set<Integer> uniqueElements = new HashSet<>();
        // Set to store duplicate elements
        Set<Integer> duplicates = new HashSet<>();

        // Iterate through the array
        for (int element : array) {
            // If the element is already in uniqueElements, it's a duplicate
            if (!uniqueElements.add(element)) {
                duplicates.add(element);
            }
        }

        // Print the duplicate elements
        if (duplicates.isEmpty()) {
            System.out.println("No duplicate elements found.");
        } else {
            System.out.println("Duplicate elements in the array: " + duplicates);
        }
    }

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

        //print
        findAndPrintDuplicates(array);
        scanner.close();

    }
}