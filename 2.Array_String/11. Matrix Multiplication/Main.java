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



    }
    //method to read the matrices from user
    public static int[][] readMatrix(Scanner scanner, int rows, int columns){
        int[][] matrix = new int[rows][columns];

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

}