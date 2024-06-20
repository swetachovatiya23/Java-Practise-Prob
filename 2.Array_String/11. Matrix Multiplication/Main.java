//Matrix multiplication

import java.util.*;

public class Main{
    public static void main(String args[]){
    //scanner class
    Scanner scanner = new Scanner(System.in);

    //prompt for dimensions of the matrix
    System.out.println("Enter the number of rows : ");
    int rows = scanner.nextInt();

    System.out.println("Enter the number of columns : ");
    int columns = scanner.nextInt();

    //read the matrices from user
    System.out.println("Enter the elements of the first matrix : ");
    int[][] matrix1 = readMatrix(scanner, rows, columns);

    System.out.println("Enter the elements of second matrix : ");
    int[][] matrix2 = readMatrix(scanner, rows, columns);

    //Multiply the matrix


    }
    //method to read the matrices from user
    public static int[][] readMatrix(Scanner scanner, int rows, int columns){
        int[][] matrix = new int[rows][columns];

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    //method to multiply two matrix
    public static int[][] multiplyMatrix(int[][] matrix1, int[][] matrix2, int rows, int columns){
        int[][] resultMatrix = new int[rows][columns];

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return resultMatrix;
    }

}