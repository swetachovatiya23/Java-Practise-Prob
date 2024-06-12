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

        System.out.println("Enter tem. in F or C : ");
        int choice = scanner.nextInt();

        //variables to hold the input tem and result
        double inputTemp, resultTemp;

        switch (choice) {
            case 1:
                System.out.println("Enter temprature in celsius : ");
                inputTemp = scanner.nextDouble();
                resultTemp = ctof(inputTemp);
                System.out.println(inputTemp + " Celsius is" + resultTemp + "Fahrenheit.");
                break;

        }
        scanner.close();
    }
}