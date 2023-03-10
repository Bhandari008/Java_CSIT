package MultiThreading;

public class ThreadPriority extends Thread {
	@Override
	public void run() {
		System.out.println("Name = " + currentThread().getName());
		System.out.println("Priority =" + currentThread().getPriority());
	}
	
	public static void main(String[] args) {
		ThreadPriority t0 = new ThreadPriority();
		ThreadPriority t1 = new ThreadPriority();
		ThreadPriority t2 = new ThreadPriority();
		ThreadPriority t3 = new ThreadPriority();
		ThreadPriority t4 = new ThreadPriority();
		ThreadPriority t5 = new ThreadPriority();
		t5.setPriority(MAX_PRIORITY);
		t0.setPriority(5); //1
		t1.setPriority(2); //2
		t2.setPriority(4); 
		t3.setPriority(NORM_PRIORITY);
		t0.start();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
