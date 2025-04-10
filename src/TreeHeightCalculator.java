import java.lang.Math;

public class TreeHeightCalculator {

    public static void getHeightOfTree(int angle, double dist) {
        // Check constraints
        if (angle <= 0 || angle >= 90 || dist <= 0) {
            System.out.println("Invalid input");
            return;
        }

        final double instrumentHeight = 1.8;

        // Convert angle to radians
        double angleInRadians = Math.toRadians(angle);

        // Calculate height from instrument to top of tree
        double verticalHeight = Math.tan(angleInRadians) * dist;

        // Add instrument height to get total tree height
        double totalHeight = verticalHeight + instrumentHeight;

        // Print the ceiling of the total height
        System.out.println((int)Math.ceil(totalHeight));
    }

    // Sample usage
    public static void main(String[] args) {
        getHeightOfTree(56, 19); // Expected output: 30
    }
}