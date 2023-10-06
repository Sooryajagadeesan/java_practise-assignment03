import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter length of the rectangle (in cms.): ");
        float length = in.nextFloat();

        System.out.print("Enter breadth of the rectangle (in cms.): ");
        float breadth = in.nextFloat();

         /*
            When user enters an invalid value for any of the inputs, Prompt the user for valid inputs until the user enters a valid value
         */
        while(length <= 0 || breadth <= 0) {
            if(length <= 0) {
                System.out.println("Oops! Invalid length input, Please enter a non-negative value for length: ");
                length = in.nextFloat();
            }

            if(breadth <= 0) {
                System.out.println("Oops! Invalid breadth input, Please enter a non-negative value for breadth: ");
                breadth = in.nextFloat();
            }
        }

        float areaOfRectangle = calculateRectangleArea(length, breadth);
        System.out.println("Area of the rectangle with length(in cms.): " + length + " cms. and breadth(in cms.): " + breadth + " cms. is " + areaOfRectangle + " sq.cms.");
    }


    /**
     *
     * @param length The length of the rectangle
     * @param breadth The breadth of the rectangle
     * @return The area of the rectangle
     */
    static float calculateRectangleArea(float length, float breadth) {
        if(length <= 0 || breadth <= 0) {
            return 0f;
        }

        return length * breadth;
    }
}
