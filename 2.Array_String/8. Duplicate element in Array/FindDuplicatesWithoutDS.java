//Find duplicate from array

import java.util.Scanner;

public class FindDuplicatesWithoutDS {
    public static void main(String[] args) {
        // Scanner class to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt for the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Define the array
        int[] array = new int[n];

        // Prompt for the array elements
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Find and print duplicate elements
        findAndPrintDuplicates(array);

        scanner.close();
    }

    public static void findAndPrintDuplicates(int[] array) {
        boolean hasDuplicates = false;

        System.out.print("Duplicate elements in the array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.print(array[i] + " ");
                    hasDuplicates = true;
                    break; // To avoid printing the same duplicate more than once
                }
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicate elements found.");
        } else {
            System.out.println(); // New line for better formatting
        }
    }
}
