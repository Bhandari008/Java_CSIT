class Rectangle{
	private int length, breadth;
	
	// methods
	public void getData(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public void getData(int length) {
		this.length = this.breadth = length;
	}
	
	public int area() {
		return length * breadth;
	}
	
	
}


public class Overloading {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
	    r.getData(3,4); //method call
	    System.out.println("Area = " + r.area());
	    

	}

}
