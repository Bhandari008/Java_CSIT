import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter num1: ");
		int num1 = in.nextInt();

		System.out.println("Enter num2: ");
		int num2 = in.nextInt();

		System.out.println("The addition is " + (num1 + num2));

		char c = in.next().charAt(0);
	}
}
