// Take integer inputs till the user enters 0 and print the sum of all numbers
import java.util.Scanner;

public class SumOfInputNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;

        int number = in.nextInt();
        while(number != 0) {
            sum += number;
            number = in.nextInt();
        }

        System.out.println("Sum of the input number is " + sum);
    }
}
