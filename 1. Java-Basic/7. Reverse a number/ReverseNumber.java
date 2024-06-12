import java.util.Scanner;

public class ReverseNumber {

    // Method to reverse the digits of a number
    public static int reverseNumber(int number) {
        int reverse = 0;
        while (number != 0) {
            reverse = reverse * 10 + number % 10; // Add the last digit to the reversed number
            number /= 10; // Remove the last digit from the original number
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Reverse the number
        int reversedNumber = reverseNumber(num);

        // Output the result
        System.out.println("The reversed number is: " + reversedNumber);

        scanner.close();
    }
}
