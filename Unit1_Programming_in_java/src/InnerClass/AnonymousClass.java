package InnerClass;

abstract class Anonymous{
	abstract void display();
}


public class AnonymousClass {
	public static void main(String[] args) {
		Anonymous  in = new Anonymous() {	
			@Override
			void display() {
				System.out.println("Anonymous inner class");				
			}
		};
		in.display();	
	}
}
