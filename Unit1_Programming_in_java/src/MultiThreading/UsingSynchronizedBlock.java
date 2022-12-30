package MultiThreading;

class CSIT_Booking_System_3 {
	int csit_seats = 48;

	public void book(int seats) {
		System.out.println("Hello");
		synchronized (this) {
			if (csit_seats >= seats) {
				System.out.println(seats + " booked success.");
				csit_seats = csit_seats - seats;
				System.out.println("Remaining Seats = " + csit_seats);
			} else {
				System.out.println("Seats are not available.");
				System.out.println("Only " + csit_seats + " are avaialble.");
			}
		}
	}
}

public class UsingSynchronizedBlock extends Thread {

	static CSIT_Booking_System_3 cbs;
	int seats;

	@Override
	public void run() {
		cbs.book(seats);
	}

	public static void main(String[] args) {

		cbs = new CSIT_Booking_System_3();

		UsingSynchronizedBlock t1 = new UsingSynchronizedBlock();
		t1.seats = 15;
		t1.start();

		UsingSynchronizedBlock t2 = new UsingSynchronizedBlock();
		t2.seats = 13;
		t2.start();

		UsingSynchronizedBlock t3 = new UsingSynchronizedBlock();
		t3.seats = 25;
		t3.start();
	}

}
