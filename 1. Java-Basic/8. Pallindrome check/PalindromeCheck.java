import java.util.Scanner;

public class PalindromeCheck {

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        // Negative numbers are not palindromes
        if (number < 0) {
            return false;
        }

        // Find the divisor to extract the first digit
        int divisor = 1;
        while (number / divisor >= 10) {
            divisor *= 10;
        }

        while (number != 0) {
            int leading = number / divisor; // Extract leading digit
            int trailing = number % 10; // Extract trailing digit

            // If the leading and trailing digits do not match, it's not a palindrome
            if (leading != trailing) {
                return false;
            }

            // Remove the leading and trailing digits and adjust the divisor
            number = (number % divisor) / 10;
            divisor /= 100;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Check if the number is a palindrome
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }

        scanner.close();
    }
}
