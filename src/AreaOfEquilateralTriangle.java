import java.util.Scanner;
import java.lang.Math;
public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the side of the equilateral triangle(in cms.): ");
        float side = in.nextFloat();

//        When the input is invalid, Prompt the user until the user enters a valid input.
        while(side <= 0) {
            System.out.println("Oops! Invalid input for side value, Please enter a non-negative input for side(in cms.):");
            side = in.nextFloat();
        }

        float areaOfEquilateralTriangle = calculateEquilateralTriangleArea(side);
        System.out.println("Area of an equilateral triangle with side(in cms.) " + side + " cms. is " + areaOfEquilateralTriangle + " sq.cms.");
    }

    /**
     *
     * @param side The side of an equilateral triangle
     * @return The area of an equilateral triangle
     */
    static float calculateEquilateralTriangleArea(float side) {
        if(side <=  0) {
            return 0f;
        }

        return (float)((Math.sqrt(3)/4) * side * side);
    }

}
