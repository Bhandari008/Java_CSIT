package MultiThreading;

class Test implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ex) {
			}
			System.out.println("Test");
		}

	}
}

class Test1 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ex) {
			}
			System.out.println("Test1");
		}

	}

}

public class UsingRunnableInterface {
	public static void main(String[] args) {
		Test t1 = new Test();
		Thread th1 = new Thread(t1);
		Test1 t2 = new Test1();
		Thread th2 = new Thread(t2);
		th1.start(); // invokes run method
		th2.start();
	}
}

// Thread Scheduler
