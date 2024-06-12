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
    }
}