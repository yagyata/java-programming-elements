import java.util.Scanner;
class intOperation{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                //Taking the user's input
                System.out.print("Enter the value of a: ");
                double a = sc.nextDouble();

                System.out.print("Enter the value of b: ");
                double b = sc.nextDouble();

                System.out.print("Enter the value of c: ");
                double c = sc.nextDouble();

                // Computing integer operations
                double result1 = a + b * c;   // Multiplication (*) has higher precedence than addition (>
                double result2 = a * b + c;   // Multiplication (*) is evaluated first, then addition (+)
                double result3 = c + a / b;   // Division (/) is evaluated first, then addition (+)
                double result4 = a % b + c;   // Modulus (%) is evaluated first, then addition (+)

                System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + " and " + result4);
        }
}
