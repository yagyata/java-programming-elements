import java.util.Scanner;
class TotalPriceCalculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//Taking input from the user
		System.out.print("Enter the price of the item: ");
		double unitPrice = sc.nextDouble();

		System.out.print("Enter the quantity: ");
		int quantity = sc.nextInt();

		//Calculating the total purchase price
		double totalPrice = unitPrice * quantity;

		//Displaying the result
		System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
	}
}
