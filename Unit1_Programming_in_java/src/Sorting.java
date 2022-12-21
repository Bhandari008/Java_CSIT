// Implementation of an array

public class Sorting {

	public void SortingNum(int[] num) { // Method Declaration
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[j] < num[i]) {
					int temp;
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.println("The sorted elements are:");
		for (int n : num)
			System.out.println(n);
	}

	public static void main(String[] args) {
		int[] numbers = { 23, 12, 14, 15, 18, 10, 20, 30, 11, 12, 60, 65, 73 };
		System.out.println("The array elements are:");
		for (int n : numbers)
			System.out.println(n);

		Sorting s = new Sorting();
		s.SortingNum(numbers);

	}
}

// Shortcut keys
// Sysout Ctrl + Space
// Formatting Ctrl + Shift + F
