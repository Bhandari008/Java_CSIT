package MultiThreading;


class CSIT_Booking_System_2{
	int csit_seats = 48;
	public synchronized void book(int seats) {
		if(csit_seats >=seats) {
			System.out.println(seats + " booked success.");
			csit_seats = csit_seats - seats;
			System.out.println("Remaining Seats = " + csit_seats);
		}
		else {
			System.out.println("Seats are not available.");
			System.out.println("Only "+ csit_seats + " are avaialble.");
		}
	}
}

public class WithSynchronization extends Thread {

	static CSIT_Booking_System_2 cbs;
	int seats;
	@Override
	 public  void run() {
		cbs.book(seats);
	}
	
	public static void main(String[] args) {
		
		cbs = new CSIT_Booking_System_2();
		
		WithSynchronization t1 = new WithSynchronization();
		t1.seats = 15;
		t1.start();
		
		
		WithSynchronization t2 = new WithSynchronization();
		t2.seats = 13;
		t2.start();
		
		
	}

}
