
class AB{
	private int A, B;
	public void setA(int A) {
		this.A = A;
	}
	public void setB(int B) {
		this.B = B;
	}
	
	public int getA() {
		return A;
	}
	
	public int getB() {
		return B;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		AB obj = new AB();
		obj.setA(25);
		obj.setB(30);
		
		System.out.println("A:" + obj.getA());
		System.out.println("B:" + obj.getB());
		

	}

}
