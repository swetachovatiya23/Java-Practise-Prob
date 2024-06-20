//Charecter count in string

import java.util.*;

public class Main{
    //character count method
    public static int[] characterCount(String str){
        //create an array to store charecter count
        int[] charCountArray = new int[256];

        //iterate through each char in string
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            charCountArray[c]++;
        }
        return charCountArray;
    }
    public static void main(String args[]) {
        //scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String input = scanner.nextLine();

        //call the charecter count method to get the counts
        int[] charCount = characterCount(input);

        //print the charecter count
        System.out.println("Charecter counts : ");

        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 0) {
                System.out.println((char) i + ": " + charCount[i]);
            }
        }
        scanner.close();
    }
}

//if want to do sum of that char count add this :
//int sum = 0;
// for (int count : charCountArray) {
//     sum += count;
// }

// // Print the sum
// System.out.println("Sum of character counts: " + sum);

// scanner.close()