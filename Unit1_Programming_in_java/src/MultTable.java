
public class MultTable {

	final static int ROWS = 20;
	final static int COLUMNS = 20;

	public static void main(String[] args) {
		int product[][] = new int[ROWS][COLUMNS];
		System.out.println("*******Multiplication Table***********");
		System.out.println(" ");
		for (int i = 1; i < ROWS; i++) {
			for (int j = 1; j <= 10; j++) {
				product[i][j] = i * j;
				System.out.printf("%d * %d = %d\n", i, j, product[i][j]);
			}
			System.out.println(" ");
		}
	}
}
