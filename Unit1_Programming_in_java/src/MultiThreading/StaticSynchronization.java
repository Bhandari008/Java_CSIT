package MultiThreading;

class CSIT_Booking_System_4 {
	static int csit_seats = 48;

	public static synchronized void book(int seats) {
		
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



public class StaticSynchronization extends Thread {
	
	CSIT_Booking_System_4 cbs;
	int seat;
	public StaticSynchronization(CSIT_Booking_System_4 cbs, int seat) {
		this.cbs = cbs;
		this.seat = seat;
	}
	@Override
	public void run() {
		cbs.book(seat);
	}

	public static void main(String[] args) {
		CSIT_Booking_System_4 cbs = new CSIT_Booking_System_4();
		CSIT_Booking_System_4 cbs1 = new CSIT_Booking_System_4();

		StaticSynchronization th1 = new StaticSynchronization(cbs,14);
		th1.start();
		
		StaticSynchronization th2 = new StaticSynchronization(cbs1, 12);
		th2.start();
	}

}
