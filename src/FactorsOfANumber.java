import java.util.Scanner;
import java.util.ArrayList;

public class FactorsOfANumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number to find its factors: ");
        int number = in.nextInt();

//        When the input is invalid, Prompt the user to enter valid input.
        while(number <= 0) {
            System.out.println("Oops! Invalid input, Please enter a non-negative number");
            number = in.nextInt();
        }

        ArrayList<Integer> factors = calculateFactorsOfANumber(number);
        System.out.println("Factors of " + number + " is " + factors);
    }

    /**
     *
     * @param number The number for which we have to find the factors
     * @return The factors of a number
     */
    static ArrayList<Integer> calculateFactorsOfANumber(int number) {
        ArrayList<Integer> factors = new ArrayList<>(10);
        if (number <= 0) {
            return factors;
        }

        factors.add(1);

        int start = 2;
        while (start  <= number / 2) {
            if(number % start == 0) {
                factors.add(start);
            }
            start++;
        }

        if(number != 1) {
            factors.add(number);
        }

        return factors;
    }
}
