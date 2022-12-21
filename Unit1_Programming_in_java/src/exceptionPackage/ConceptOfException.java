package exceptionPackage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConceptOfException {

	public static float divide(int numerator, int denominator) {
		return numerator / denominator;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean continueLoop = true;

		do {

			try {

				System.out.println("Enter numerator");
				int n = input.nextInt();

				System.out.println("Enter denominator");
				int d = input.nextInt();

				System.out.println("The result is:" + divide(n, d));
				continueLoop = false;
			} catch (InputMismatchException ex) {
				System.err.println("Exception is:" + ex);
				input.nextLine();
				System.out.println("Enter proper value");
			} catch (ArithmeticException ex) {
				System.err.println("Exception is:" + ex);
				System.out.println("Enter non zero value");
			}
		} while (continueLoop);
		input.close();
	}

}
