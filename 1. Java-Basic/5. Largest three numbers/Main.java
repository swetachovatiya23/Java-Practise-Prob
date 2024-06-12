//Find the largest of three numbers.
import java.util.*;

public class Main{
    public static int findlargest(int a, int b, int c){
        int largest;
        if(a >= b && a >= c) {
            largest = a;
        } else if(b >= a && b >=c) {
            largest = b;
        } else {
            largest = c;
        }
        return largest;

    }

    public static void main(String args[]) {
        //scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int a = scanner.nextInt();

        System.out.println("Enter second number : ");
        int b = scanner.nextInt();

        System.out.println("Enter third number : ");
        int c = scanner.nextInt();

        //find the largest number
        int largest = findlargest(a, b, c);

        System.out.println("Largest number is : " + largest);

        scanner.close();


    }
}