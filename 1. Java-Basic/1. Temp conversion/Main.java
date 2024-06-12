//Temrature conversion from F to C and C to F.
import java.util.*;

public class Main{
    public static double ctof (double celsius) {
        return (9/5 * celsius) + 32;
    }

    public static double ftoc (double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
    public static void main(String args[]) {
        //scanner class 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 to convert Celsius to Fahrenheit or 2 to convert Fahrenheit to Celsius: ");
        int choice = scanner.nextInt();

        //variables to hold the input tem and result
        double inputTemp, resultTemp;

        switch (choice) {
            case 1:
                System.out.println("Enter temprature in celsius : ");
                inputTemp = scanner.nextDouble();
                resultTemp = ctof(inputTemp);
                System.out.println(inputTemp + " Celsius is " + resultTemp + " Fahrenheit.");
                break;
            case 2:
                System.out.println("Enter temprature in farhenheit : ");
                inputTemp = scanner.nextDouble();
                resultTemp = ftoc(inputTemp);
                System.out.println(inputTemp + " Fahrenheit is " + resultTemp + " Celsius.");
                break;

        }
        scanner.close();
    }
}