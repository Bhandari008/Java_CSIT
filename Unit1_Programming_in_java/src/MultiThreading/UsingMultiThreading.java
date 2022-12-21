package MultiThreading;

class Hi extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ex) {
			}
			System.out.println("Hi");
		}
	}
}

class Hello extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ex) {
			}
			System.out.println("Hello");
		}
	}
}

public class UsingMultiThreading {

	public static void main(String[] args) {
		Hi th1 = new Hi();
		Hello th2 = new Hello();
		th1.start(); // invokes run method
		th2.start();

	}

}

// Thread class
// Java lang
// Runnable interface
