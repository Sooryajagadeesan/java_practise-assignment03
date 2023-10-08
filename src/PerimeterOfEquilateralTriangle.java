import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the side of the equilateral triangle(in cms.): ");
        float side = in.nextFloat();

//        When the input is invalid, Prompt the user until the user enters a valid input.
        while(side <= 0) {
            System.out.println("Oops! Invalid input for side value, Please enter a non-negative input for side(in cms.):");
            side = in.nextFloat();
        }

        float perimeterOfEquilateralTriangle = calculateEquilateralTrianglePerimeter(side);
        System.out.println("Perimeter of an equilateral triangle with side(in cms.) " + side + " cms. is " + perimeterOfEquilateralTriangle + " cms.");
    }

    /**
     *
     * @param side The side of an equilateral triangle
     * @return The perimeter of an equilateral triangle
     */
    static float calculateEquilateralTrianglePerimeter(float side) {
        if(side <= 0) {
            return 0f;
        }

        return 3 * side;
    }
}
