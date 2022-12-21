
public class VariableConcept {

	int a, b; // instance or non-static variable
	// Variables that need object or instance to be accessed are instance variable.
	static int x, y; // static or class variables
	// Variables that can be accessed without instance or object

	public void add() { // non-static method or instance method
	}

	public static void subtract() { // static method

	}

	public static void main(String[] args) {
		VariableConcept vc; // Reference
		vc = new VariableConcept(); // object or instance

		vc.a = 20;
		vc.b = 30;

		x = 25;
		y = 35;

	}

}
