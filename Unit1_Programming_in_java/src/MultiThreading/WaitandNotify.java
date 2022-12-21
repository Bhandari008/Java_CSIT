package MultiThreading;

class CollegeEarning extends Thread{
	int total = 0;
	@Override
	public void run() {
		synchronized (this) {
			for(int i=0;i <= 48;i++) {
				total = total + 880000;
			}
			notify(); // Lock release
		}
		
	}
}

public class WaitandNotify {

	public static void main(String[] args) throws InterruptedException  {
		CollegeEarning ce = new CollegeEarning();
		ce.start();
		
		synchronized (args) {
			 args.WaitandNotify();// request for lock
		}
		System.out.println("Total Earning = "+ ce.total);
		

	}

}
