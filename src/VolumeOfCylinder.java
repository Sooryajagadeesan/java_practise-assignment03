import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the radius of the cylinder(in cms.): ");
        float radius = in.nextFloat();
        System.out.print("Enter the height of the cylinder(in cms.): ");
        float height = in.nextFloat();

// When any one of the inputs is invalid, Prompt the user to enter a valid value
        while(radius <= 0 || height <= 0) {
            if(radius <= 0) {
                System.out.println("Oops! Invalid value for radius, Please enter a non-negative value for radius(in cms.):");
                radius = in.nextFloat();
            }

            if(height <= 0) {
                System.out.println("Oops! Invalid value for height, Please enter a non-negative value for height(in cms.):");
                height = in.nextFloat();
            }
        }

        float volumeOfCylinder = calculateCylinderVolume(radius, height);
        System.out.println("Volume of cylinder with radius: " + radius + " cms. and height: " + height + " cms. is " + volumeOfCylinder + " cu.cms." );

    }

    /**
     *
     * @param radius The radius of the cylinder
     * @param height The height of the cylinder
     * @return The volume of the cylinder
     */
    static float calculateCylinderVolume(float radius, float height) {
        if(radius <= 0 || height <= 0) {
            return 0f;
        }

        // Made use of `PI` property of `Math` class instead of (22/7.0)
        return (float)(Math.PI * radius * radius * height);
    }
}
