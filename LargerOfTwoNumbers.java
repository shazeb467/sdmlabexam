
//Java Program to find Larger of Two NUmbers
import java.util.Scanner;

public class LargerOfTwoNumbers{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the first number: ");
		int num1 = sc.nextInt();
		System.out.println(" Enter the second number: ");
		int num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.println("The Larger numbers is  : " + num1);
		} else {
			System.out.println("The Larger numbers is  : " + num2);

		}
	sc.close();
	}

}
