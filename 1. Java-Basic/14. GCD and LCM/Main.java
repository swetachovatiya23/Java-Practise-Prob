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
    public static int lcm(int a , int b) {
        return a * (b/gcd(a, b)); //to avoid potential overflow
    }


    public static void main(String args[]) {
        //scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int num1 = scanner.nextInt();

        System.out.println(("Enter the second number : "));
        int num2 = scanner.nextInt();

        //calculate GCD and LCM
        int gcdResult = gcd(num1, num2);
        int lcmResult = lcm(num2, num2);

        System.out.println(" The GCD of " + num1 + " and " + num2 + " is " + gcdResult);
        System.out.println(" The LCM of " + num1 + " and " + num2 + " is " + lcmResult);

        scanner.close();

    }
}