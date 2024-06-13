import java.util.*;

public class Main{
    public static int sumOfnum(int num){
        int sum = 0;

        for(int i=0; i<=num; i++){
            sum = sum + i;
        }
        return sum;

    }
    public static void main(String args[]){
        //scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the N natural num : ");
        int num = scanner.nextInt();

        //print sum
        int sumN = sumOfnum(num);

        System.out.println("Sum of " + num + " is " + sumN);
        scanner.close();

    }
}