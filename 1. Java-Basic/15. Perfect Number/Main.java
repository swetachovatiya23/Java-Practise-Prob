import java.util.*;

public class Main {

    public static int perfectNum(int num){
        int sum = 0;

        for(int i=1; i <= num/2; i++){
            if(num % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
    public static void main(String args[]){
        //scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        int comp = perfectNum(num);

        if(comp == num) {
            System.out.println(num + " is a perfect number.");
        }else {
            System.out.println(num + " is not a perfect number.");
        }
        scanner.close();


    }
}