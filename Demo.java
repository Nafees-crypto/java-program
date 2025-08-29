package Practice;

import java.util.Scanner;

public class Demo {

	public int addNumbers(int x, int y) {
		return x + y;
	}

	public int subNumbers(int x, int y) {
		return x - y;
	}

	public int multiplyNumbers(int x, int y) {
		return x * y;
	}

	public double divideNumbers(int x, int y) {
		if (y == 0) {
			throw new ArithmeticException("Cannot divide by zero.");
		}
		return (double) x / y;
	}

	public static void main(String[] args) {
		Demo obj = new Demo();
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the first number:");
		int num1 = scan.nextInt();

		System.out.println("Enter the operator (+, -, *, /):");
		char operator = scan.next().charAt(0);

		System.out.println("Enter the second number:");
		int num2 = scan.nextInt();

		// Perform calculation based on operator
		switch (operator) {
		case '+':
			System.out.println("Result: " + obj.addNumbers(num1, num2));
			break;
		case '-':
			System.out.println("Result: " + obj.subNumbers(num1, num2));
			break;
		case '*':
			System.out.println("Result: " + obj.multiplyNumbers(num1, num2));
			break;
		case '/':
			try {
				System.out.println("Result: " + obj.divideNumbers(num1, num2));
			} catch (ArithmeticException e) {
				System.out.println("Error: " + e.getMessage());
			}
			break;
		default:
			System.out.println("Invalid operator. Please use +, -, *, or /");
		}

		scan.close();
	}
}




//package Tasks;
//
//import java.util.Scanner;

//public class Calculator {
//
//	public int addNumbers(int x, int y) {
//		int add = x + y;
//		return add;
//	}
//
//	public int subNumbers(int x, int y) {
//		int sub = x - y;
//		return sub;
//	}
//
//	public int mulNumbers(int x, int y) {
//		int sub = x * y;
//		return sub;
//	}
//	
//	public static void main(String[] args) {
//		Calculator obj = new Calculator();
//		Calculator obj1 = new Calculator();
//		Scanner scan = new Scanner(System.in);
//
//		System.out.println("Enter the first Number:");
//		int num1 = scan.nextInt();
//
//		System.out.println("Enter the operator:");
//		char operatorobj = scan.next().charAt(0);
//
//		System.out.println("Enter the second NUmber:");
//		int num2 = scan.nextInt();
//
//		int add = obj.addNumbers(num1, num2);
//		System.out.println(add);
//		
//		int sub = obj1.subNumbers(num1, num2);
//		System.out.println(sub);
//
//	}
//
//}