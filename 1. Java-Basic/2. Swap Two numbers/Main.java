// swap two numbers without using third number
import java.util.*;

public class Main {

        public static int[] swapWithArith(int a, int b) {
            a = a + b;
            b = a - b;
            a = a - b;
            return new int[]{a, b};
        }

        public static int[] swapWithXOR(int a, int b) {
            a = a^b;
            b = a^b;
            a = a^b; 
            return new int[]{a, b};
        }

    
    public static void main(String args[]){
        //scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int a = scanner.nextInt();

        System.out.println("Enter second number : ");
        int b = scanner.nextInt();

        //choose the method for swapping
        System.out.println("Enter 1 to swap using arithmatic and Enter 2 to swap using XOR : ");
        int choice = scanner.nextInt();

        int[] swappedValues;

        //perform the swapping based on user choice
        if(choice == 1){
            swappedValues = swapWithArith(a, b);
        }else if(choice == 2){
            swappedValues = swapWithXOR(a, b);
        }else {
            System.out.println("Invalid choice");
            scanner.close();
            return;
        }

        //outpur the result , [0] [1] represent's it's index
        System.out.println("after swap : a = " + swappedValues[0] + ", " + "b = " + swappedValues[1]);
        scanner.close();
    }
}