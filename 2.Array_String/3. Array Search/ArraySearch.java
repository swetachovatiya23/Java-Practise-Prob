//Array Search: Search for an element in an array.

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create an array of the specified size
        int[] array = new int[n];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Prompt the user to enter the element to search for
        System.out.print("Enter the element to search for: ");
        int searchElement = scanner.nextInt();

        // Search for the element in the array
        boolean found = false;
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (array[i] == searchElement) {
                found = true;
                index = i;
                break;
            }
        }

        // Output the result
        if (found) {
            System.out.println("Element " + searchElement + " found at index " + index + ".");
        } else {
            System.out.println("Element " + searchElement + " not found in the array.");
        }

        scanner.close();
    }
}
