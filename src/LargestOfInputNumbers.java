// Take integer inputs till the user enters 0 and print the largest number from all.
import java.util.Scanner;

public class LargestOfInputNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;

        int number = in.nextInt();
        while(number != 0) {
            if(number > largest) {
                largest = number;
            }

            number = in.nextInt();
        }

        System.out.println("The largest of the input numbers is " + largest);
    }
}
