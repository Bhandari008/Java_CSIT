class RectangleOne{
	private int length, breadth;
	
	
	// default constructor
	public RectangleOne(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public RectangleOne(int length) {
		this.length = this.breadth = length;
	}
	
	public int area() {
		return length * breadth;
	}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		RectangleOne r = new RectangleOne(5,4);
		System.out.println("Area of rectangle= " + r.area());
		
		
		RectangleOne s = new RectangleOne(6);
		System.out.println("Area of square = " + s.area());
		
	}

}
