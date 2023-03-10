package MultiThreading;

class Good {
	void display() throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			Thread.sleep(1000);
			System.out.println("Good");
		}
	}
}

class Students {
	void display() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ex) {
			}
			System.out.println("Students");
		}
	}
}

public class WithoutMultiThreading {

	public static void main(String[] args) throws InterruptedException {

		Good g = new Good();
		g.display();
		Students s = new Students();
		s.display();
	}

}
