import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a non-negative value for base(in cms.): ");
        float base = in.nextFloat();
        System.out.print("Enter a non-negative value for height(in cms.): ");
        float height = in.nextFloat();

        /*
            When user enters an invalid value for any of the inputs, Prompt the user for valid inputs until the user enters a valid value
         */
        while(base <= 0 || height <= 0) {
            if(base <= 0) {
                System.out.println("Oops! Invalid value for base input, Please enter a non-negative value for base(in cms.): ");
                base = in.nextFloat();
            }

            if(height <= 0) {
                System.out.println("Oops! Invalid value for height input, Please enter a non-negative value for height(in cms.): ");
                height = in.nextFloat();
            }
        }

        float areaOfTriangle = calculateTriangleArea(base, height);
        System.out.println("Area of the triangle with base(in cms.): " + base + " cms. and height(in cms.): " + height + " cms is " + areaOfTriangle + " sq.cms.");
    }

    /**
     *
     * @param base The base of the triangle
     * @param height The height of the triangle
     * @return The area of the triangle
     */
    static float calculateTriangleArea(float base, float height) {
        if(base <= 0 || height <= 0) {
            return 0f;
        }
//        Return the `float` representation of 1/2 * base * height
        return (float)((1/2.0) * base * height);
    }
}
