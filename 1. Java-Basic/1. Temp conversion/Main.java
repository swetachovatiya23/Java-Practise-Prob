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
        double inputtemp, resultTemp;

        switch (choice) {
            
        }
        scanner.close();
    }
}