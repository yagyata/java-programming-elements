import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for base and height in cm
        System.out.print("Enter the base of the triangle (in cm): ");
        double base = sc.nextDouble();
        System.out.print("Enter the height of the triangle (in cm): ");
        double height = sc.nextDouble();

        // Calculating area in square centimeters
        double areaCm = 0.5 * base * height;

        // Converting square cm to square inches
        double conversionFactor = 2.54 * 2.54; // Since 1 inch = 2.54 cm, 1 sq in = (2.54)^2 sq cm
        double areaIn = areaCm / conversionFactor;

        // Displaying the results
        System.out.println("The Area of the triangle in sq in is " + areaIn + " and sq cm is " + areaCm);

	}
}
