package InnerClass;

public class LocalInner {

	int a = 20;
	public void method() {
		int b  = 40;
		class Inner{// Local Inner Class
			int c = 60;
			public void print() {
				System.out.println(a + ". " + b + ". " + c);
			};
		}
		Inner in = new Inner();
		in.print();
	}
	public static void main(String[] args) {
		LocalInner ln = new LocalInner();
		ln.method();
	}
}
