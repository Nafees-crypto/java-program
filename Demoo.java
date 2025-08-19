package example;

import java.util.Scanner;

public class Demoo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String st1, st2;
		System.out.println("string");
		System.out.println("Enter the first string (string 1)");
		st1 = scan.nextLine();
		System.out.println("Enter the second string (string 2)");
		st2 = scan.nextLine();
		System.out.println(st1 + "\n" + st2);
	}
}


