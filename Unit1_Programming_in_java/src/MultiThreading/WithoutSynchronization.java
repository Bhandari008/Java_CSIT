package MultiThreading;


class CSIT_Booking_System{
	int csit_seats = 48;
	public void book(int seats) {
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

public class WithoutSynchronization extends Thread {

	CSIT_Booking_System cbs = new CSIT_Booking_System();
	int seats;
	@Override
	 public void run() {
		cbs.book(seats);
	}
	
	public static void main(String[] args) {
		
		
		WithoutSynchronization t1 = new WithoutSynchronization();
		t1.seats = 15;
		t1.start();
		
		
		WithoutSynchronization t2 = new WithoutSynchronization();
		t2.seats = 13;
		t2.start();
		
	}

}
