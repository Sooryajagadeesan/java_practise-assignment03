import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter side of the square (in cms.): ");
        float side = in.nextFloat();


         /*
            When user enters an invalid value for any of the inputs, Prompt the user for valid inputs until the user enters a valid value
         */
        while(side <= 0) {
            System.out.println("Oops! Invalid side input, Please enter a non-negative value for side: ");
            side = in.nextFloat();
        }

        float perimeterOfSquare = calculateSquarePerimeter(side);
        System.out.println("Perimeter of the square with side(in cms.): " + side + " cms. is " + perimeterOfSquare + " cms.");
    }


    /**
     *
     * @param side The side of the square
     * @return The perimeter of the square
     */
    static float calculateSquarePerimeter(float side) {
        if(side <= 0) {
            return 0f;
        }

        return 4 * side;
    }
}
