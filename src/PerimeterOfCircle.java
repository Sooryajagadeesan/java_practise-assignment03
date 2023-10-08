import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the radius of the circle(in cms.): ");
        float radius = in.nextFloat();

//        When the input is invalid, Prompt the user unitl the user enters a valid input.
        while(radius <= 0) {
            System.out.println("Oops! Invalid input for radius value, Please enter a non-negative input for radius(in cms.):");
            radius = in.nextFloat();
        }

        float perimeterOfCircle = calculateCirclePerimeter(radius);
        System.out.println("Area of a circle with radius(in cms.) " + radius + " cms. is " + perimeterOfCircle + " cms.");
    }

    /**
     *
     * @param radius The radius of the circle
     * @return The perimeter of the circle
     */
    static float calculateCirclePerimeter(float radius) {
        if(radius <= 0) {
            return 0f;
        }

        return (float)(2 * (22/7.0) * radius);
    }
}
