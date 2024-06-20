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
        int[][] resultMatrix = addMatrices(matrix1, matrix2, rows, columns);

        //print the resulting matrix
        System.out.println("Resulting Matrix after addition : ");
        printMatrix(resultMatrix, rows, columns);

        scanner.close();

    }

    //method to read a matrix from the user
    public static int[][] readMatrix(Scanner scanner, int rows, int columns){
        int[][] matrix = new int[rows][columns];

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    //method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2, int rows, int columns) {
        int[][] resultMatrix = new int[rows][columns];

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return resultMatrix;
    }

    //method to print a matrix
    public static void printMatrix(int[][] matrix, int rows, int columns){
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

