import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the radius of the sphere(in cms.): ");
        float radius = in.nextFloat();

// When any one of the inputs is invalid, Prompt the user to enter a valid value
        while(radius <= 0) {
            if(radius <= 0) {
                System.out.println("Oops! Invalid value for radius, Please enter a non-negative value for radius(in cms.):");
                radius = in.nextFloat();
            }
        }

        float volumeOfSphere = calculateSphereVolume(radius);
        System.out.println("Volume of sphere with radius: " + radius  + " cms. is " + volumeOfSphere + " cu.cms." );

    }

    /**
     *
     * @param radius The radius of the sphere
     * @return The volume of the sphere
     */
    static float calculateSphereVolume(float radius) {
        if(radius <= 0) {
            return 0f;
        }

        // Made use of `PI` property of `Math` class instead of (22/7.0)
        return (float)((4/3.0) * Math.PI * radius * radius * radius);
    }
}
