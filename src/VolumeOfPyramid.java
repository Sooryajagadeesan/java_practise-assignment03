import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the length of the pyramid(in cms.): ");
        float length = in.nextFloat();
        System.out.print("Enter the width of the pyramid(in cms.): ");
        float width = in.nextFloat();
        System.out.print("Enter the height of the pyramid(in cms.): ");
        float height = in.nextFloat();

// When any one of the inputs is invalid, Prompt the user to enter a valid value
        while(length <= 0 || width <= 0 || height <= 0) {
            if(length <= 0) {
                System.out.println("Oops! Invalid value for length, Please enter a non-negative value for length(in cms.):");
                length = in.nextFloat();
            }

            if(width <= 0) {
                System.out.println("Oops! Invalid value for width, Please enter a non-negative value for width(in cms.):");
                width = in.nextFloat();
            }

            if(height <= 0) {
                System.out.println("Oops! Invalid value for height, Please enter a non-negative value for height(in cms.):");
                height = in.nextFloat();
            }
        }

        float volumeOfPyramid = calculatePyramidVolume(length, width, height);
        System.out.println("Volume of pyramid with length: " + length + " cms. and width: " + width + " cms. and height: " + height + " cms. is " + volumeOfPyramid + " cu.cms." );

    }

    /**
     *
     * @param length The length of the pyramid
     * @param height The height of the pyramid
     * @return The volume of the pyramid
     */
    static float calculatePyramidVolume(float length, float width, float height) {
        if(length <= 0 || width <= 0 || height <= 0) {
            return 0f;
        }

        // Made use of `PI` property of `Math` class instead of (22/7.0)
        return (float)((length * width * height) / 3.0);
    }
}
