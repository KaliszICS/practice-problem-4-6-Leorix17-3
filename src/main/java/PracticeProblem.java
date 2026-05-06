/**
	* File: Lesson 4.6 - Data type checking
	* Author: Leo
	* Date Created: May 6, 2023
	* Date Last Modified: May 6, 2026
	*/

import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		boolean num = multipleIntChecker();
		System.out.println(num);
	}

	public static int intChecker() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input an integer: ");
		while (!(input.hasNextInt())) {
			input.nextLine(); 
			System.out.print("Input an integer: ");
		}
		int num = input.nextInt();
		input.nextLine();
		return num;
	}

	public static double doubleChecker() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		while (!(input.hasNextDouble())) {
			input.nextLine(); 
			System.out.println("Input a number: ");
		}
		double num = input.nextDouble();
		input.nextLine();
		return num;
	}

	public static boolean booleanChecker() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a boolean: ");
		while (!(input.hasNextBoolean())) {
			input.nextLine(); 
			System.out.println("Input a boolean: ");
		}
		boolean bool = input.nextBoolean();
		input.nextLine();
		return bool;
	}

	public static boolean multipleIntChecker() {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			System.out.print("Input an integer: ");
		while (!(input.hasNextInt())) {
			input.nextLine(); 
			System.out.print("Input an integer: ");
		}
		int num = input.nextInt();
		input.nextLine();
		}
		return true;
	}
}
