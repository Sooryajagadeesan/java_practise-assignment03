import java.util.Scanner;

public class TSAOfCube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter side of the cube (in cms.): ");
        float side = in.nextFloat();


         /*
            When user enters an invalid value for any of the inputs, Prompt the user for valid inputs until the user enters a valid value
         */
        while(side <= 0) {
            System.out.println("Oops! Invalid side input, Please enter a non-negative value for side: ");
            side = in.nextFloat();
        }

        float TSAOfCube = calculateCubeTSA(side);
        System.out.println("TSA of the cube with side(in cms.): " + side + " cms. is " + TSAOfCube + " sq.cms.");
    }


    /**
     *
     * @param side The side of the cube
     * @return The TSA of the cube
     */
    static float calculateCubeTSA(float side) {
        if(side <= 0) {
            return 0f;
        }

        return 6 * side * side;
    }
}
