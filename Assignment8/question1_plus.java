package assignments.assignment_8_methods;

import java.util.Scanner;

public class question1_plus {

	public static void main(String[] args) {

		plus();

	}

	public static void plus() {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the first number : ");
		int num1 = sc.nextInt();

		System.out.println("enter the second number : ");
		int num2 = sc.nextInt();

		System.out.println("result = " + (num1 + num2));

	}

}
