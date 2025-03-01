import java.util.Scanner;
class KilometersToMiles{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the distance in Kilometers: ");
		double km = sc.nextDouble();
		double mile = km * 1.6;
		System.out.println("The total miles is " + mile + " mile for the given " + km + " km");
	}
}
