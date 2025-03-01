import java.util.Scanner;
class QuotientAndReminder{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//Taking input for two numbers
		System.out.print("Enter the first number (dividend): ");
		int number1 = sc.nextInt();
		System.out.print("Enter the second number (divisor): ");
		int number2 = sc.nextInt();

		//Calculating quotient and remainder
		int quotient = number1 / number2;
		int remainder = number1 % number2;

		System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two numbers " + number1 + " and " + number2);
	}
}

