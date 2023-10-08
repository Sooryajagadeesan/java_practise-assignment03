import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number to find factorial: ");
        long number = in.nextInt();

//        When the input is invalid, Prompt the user for valid input
        while(number < 0) {
            System.out.println("Oops! Invalid input, Please enter non-negative value:");
            number = in.nextLong();
        }

        long factorial = findFactorial(number);
        System.out.println("Factorial of " + number + " is " + factorial);
    }

    /**
     *
     * @param number The number whose factorial needs to be calculated
     * @return The factorial of a number
     */
    static long findFactorial(long number) {
        if(number < 0) {
//            Factorial of negative number is NOT DEFINED from Byju's blog on 08.10.2023
            return -1;
        }

        long factorial = 1;
        while(number > 1) {
            factorial = factorial * number;
            number--;
        }

        return factorial;
    }
}
