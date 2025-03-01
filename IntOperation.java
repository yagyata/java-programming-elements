import java.util.Scanner;
class intOperation{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//Taking the user's input
		System.out.print("Enter the value of a: ");
		int a = sc.nextInt();

		System.out.print("Enter the value of b: ");
                int b = sc.nextInt();

		System.out.print("Enter the value of c: ");
                int c = sc.nextInt();

		// Computing integer operations
                int result1 = a + b * c;   // Multiplication (*) has higher precedence than addition (+)
        	int result2 = a * b + c;   // Multiplication (*) is evaluated first, then addition (+)
	        int result3 = c + a / b;   // Division (/) is evaluated first, then addition (+)
        	int result4 = a % b + c;   // Modulus (%) is evaluated first, then addition (+)

		System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + " and " + result4);
	}
}



