package inheritancePackage;

class Room{
	int len, bre;
	
	public Room(int len, int bre) {
		// TODO Auto-generated constructor stub
		this.len = len;
		this.bre = bre;
	}
	
	int area() {
		return len * bre;
	}	
}

class LivingRoom extends Room{ // Single Inheritance
	int hei;
	
	public LivingRoom(int len, int bre, int hei) {
		super(len,bre); // calls the super or base constructor
		this.hei = hei;
		
	}
	
	int volume() {
		return hei * len * bre;
	}
	
}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LivingRoom lr = new LivingRoom(40, 30, 20);
		System.out.println("Area = " + lr.area());
		System.out.println("Volume = "+ lr.volume());
	}

}
