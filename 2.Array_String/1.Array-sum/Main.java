//calculate the sum of elementsin Array

public class Main{
    public static void main(String args[]) {
        int[] arr = {1,2,3,4,5,6};

        //1. initialise variable to store the value
        int sum = 0;

        //2. iterate 
        for(int i=1; i<arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("sum : " + sum);

    }
}

