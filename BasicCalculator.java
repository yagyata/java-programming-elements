import java.util.Scanner;
class BasicCalculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// Taking user input
		System.out.print("Enter the first number: ");
		float number1 = sc.nextFloat();

		System.out.print("Enter the second number: ");
		float number2 = sc.nextFloat();

		//Performing Arithmetic Operations
		float add = number1 + number2; //Addition
		float subtract = number1 - number2; //Subtraction
		float multiply = number1 * number2; //Multipication
		float divide = number1 / number2; //Division

		System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " + number1 + " and " + number2 + " is " + add + ", "+ subtract + ", "+ multiply + " and " + divide);

	}
}


