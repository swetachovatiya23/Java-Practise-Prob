//Transpose of matrix

import java.util.*;

public class Main {
    //method to read the matrix from user
    public static int[][] readMatrix(Scanner scanner, int rows, int columns){
        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the elements of matrix : ");
        for(int i=0; i<rows; i++){
            for(int j=0; i<columns; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    //method to transpose the matrix
    public static int[][] transposeMatrix(int[][] matrix, int rows, int columns){
        int[][] transMatrix = new int[columns][rows];
        
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                transMatrix[j][i] = matrix[i][j];
            }
        }
        return transMatrix;
    }

    //print the transposed matrix
    public static void printMatrix(int[][] matrix, int rows, int columns){
        for(int i=0; i<rows; i++){
            for(int j=0; j<rows; j++){
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        //scanner class
        Scanner scanner = new Scanner(System.in);

        //prompt matrix size
        System.out.println("Enter the number of rows : ");
        int rows = scanner.nextInt();

        System.out.println("Enter the numbers of columns : ");
        int columns = scanner.nextInt();

        //read the matrix from users 
        int[][] matrix = readMatrix(scanner, rows, columns);

        //Transpose the matrix
        int[][] transposedMatrix = transposeMatrix(matrix, rows, columns);
    }
}

