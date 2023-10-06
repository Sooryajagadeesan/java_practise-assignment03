import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the radius(in cms): ");
        float radius = in.nextFloat();

        /*
            When user enters an invalid value for the input, Prompt the user for valid input until the user enters a valid value
         */
        while (radius <= 0) {
            System.out.println("Oops! Invalid radius input, Please enter a non-negative radius(in cms):");
            radius = in.nextFloat();
        }

        float areaOfCircle = calculateCircleArea(radius);
        System.out.println("Area of the circle with radius " + radius + " cms. is " + areaOfCircle + " sq.cms.");
    }

    /**
     *
     * @param radius The radius of a circle
     * @return The area of the circle
     */
    static float calculateCircleArea(float radius) {
        if(radius <= 0) {
            return 0f;
        }

//        Return the `float` representation of PI * radius * radius
        return (float)((22/7.0) * radius * radius);
    }
}