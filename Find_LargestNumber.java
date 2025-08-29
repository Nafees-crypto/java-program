package DailyTasks;

import java.util.Scanner;

public class Find_LargestNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Numbers");

		System.out.println("Enter the first Number(A):");
		int a = scan.nextInt();

		System.out.println("Enter the second Number(B):");
		int b = scan.nextInt();

		System.out.println("Enter the third Number(C):");
		int c = scan.nextInt();

		if (a > b && a > c) {
			System.out.println("A is greater  " + a);
		}
		if (b > a && b > c) {
			System.out.println("B is greater  " + b);
		} else {
			System.out.println("C is greater  " + c);
		}
	}
}
