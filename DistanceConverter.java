import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        // Conversion factors
        double feetPerYard = 3.0;
        double yardsPerMile = 1760.0;

        // Converting feet to yards
        double distanceInYards = distanceInFeet / feetPerYard;

        // Converting yards to miles
        double distanceInMiles = distanceInYards / yardsPerMile;

        // Displaying the result
        System.out.println("The distance in yards is " + distanceInYards + " while the distance in miles is " + distanceInMiles);

    }
}
