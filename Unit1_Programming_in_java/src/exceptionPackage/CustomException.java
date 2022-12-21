package exceptionPackage;

import java.util.Scanner;

class OwnException extends Exception {

	public OwnException(String message) {
		super(message); // calls constructor of Exception class
	}
}

public class CustomException {
	public static void StudentAge(int age) throws OwnException {
		if (age < 0)
			throw new OwnException("Age Less than zero exception");
		else
			System.out.println("Age =" + age);
	}

	public static void main(String[] args) throws OwnException {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter age");
		int age = in.nextInt();
		StudentAge(age);
		in.close();

	}

}
