package MultiThreading;

public class YieldMethod extends Thread {
	@Override
	public void run() { // Thread 0
		Thread.yield();
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName() + " is running.");
		}
	}
	
	public static void main(String[] args) { // main thread
		YieldMethod t1 = new YieldMethod();
		t1.start();
		
		
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName() + " is running.");
		}
	}
}

// Sometimes the Thread Scheduler does not accept the yield request