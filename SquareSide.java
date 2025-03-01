import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the perimeter
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = sc.nextDouble();

        // Calculating the side length
        double side = perimeter / 4;

        // Displaying the result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

    }
}
