import java.util.*;

public class Main{

    //Method to calculate GCD
    public static int gcd(int a, int b){
        if(b != 0){
            int temp = b;
            b = a % b;
            a = temp;

        }
        return a;
    }

    //method to calclulate LCM

    public static void main(String args[]) {
        //scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int num1 = scanner.nextInt();

        System.out.println(("Enter the second number : "));
        int num2 = scanner.nextInt();


    }
}