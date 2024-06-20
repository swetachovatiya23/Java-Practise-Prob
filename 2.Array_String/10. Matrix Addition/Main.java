//Matrix addition 

import java.util.*;

public class Main{
    public static void main(String args[]){
        //scanner class
        Scanner scanner = new Scanner(System.in);

        //prompt for dimentions of matrix
        System.out.println("Enter the number of rows : ");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns : ");
        int columns = scanner.nextInt();

        //read the matrices
        System.out.println("Enter the elements of the first matrix: ");
        int[][] matrix1 = readMatrix(scanner, rows, columns);

        System.out.println("Enter the elements of second Matrix: ");
        int[][] matrix2 = readMatrix(scanner, rows, columns);

        //Add the matricies
        
    }
}

