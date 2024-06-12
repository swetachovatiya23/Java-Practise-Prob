// check the number is even or odd

import java.util.*;

public class Main{
    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

    public static boolean isOdd(int a) {
        return !isEven(a);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value : ");
        int input = scanner.nextInt();
        if( isEven(input)) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        scanner.close();
    }
    
}