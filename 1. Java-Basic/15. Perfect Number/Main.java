import java.util.*;

public class Main {

    public static boolean perfectNum(int num){
        if(num <= 1){
            return false;
        }

        int sum = 1; // 1 is a proper divisor of every number
        for(int i = 2; i <= Math.sqrt(num); i++ ) {   //Math.sqrt returns square root of num : 64 = 8.
            if(num % i == 0){
                if(i == num / i) {
                    sum += i;
                }else {
                    sum += i + num / i;
                }
            }
        }
        return sum == num;
    }
    public static void main(String args[]){
        //scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = scanner.nextInt();


    }
}