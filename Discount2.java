import java.util.Scanner;
class Discount2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the University fees: ");
		int fee = sc.nextInt();
		System.out.print("Enter the discount: ");
		int discountPercent = sc.nextInt();
		double discount = (fee*discountPercent)/100.0;
		double discountedFee = fee - discount;
		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
	}
}

