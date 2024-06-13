import java.util.*;

public class Main{
    public static int sumOfnum(int num){
        int sum = 0;

        for(int i=0; i<=num.length; i++){
            sum = sum + i;
        }
        return sum;

    }
    public static void main(String args[]){
        //scanner class
        Scanner scanner = new Scanner(Sytem.in);

        System.out.println("Enter the N natural num : ");
        int num = scanner.nextInt();


    }
}