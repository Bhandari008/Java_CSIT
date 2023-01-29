package interfacePackage;

interface FirstInterface {
	// All the methods are by default public and abstract
	void method1();

	void method2(int a);

	// by default public static (directly accessed) final (must be initialized and
	// cannot be override)
	int x = 20;

}

interface SecondInterface extends FirstInterface {
	void method1();

	int x = 40;
}

class A {

}

public class InterfaceDemo extends A implements FirstInterface, SecondInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// FirstInterface fi = new FirstInterface();
		// x = 30;
		
		System.out.println("Value of x = " + FirstInterface.x);
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Method 1 called.");
	}

	@Override
	public void method2(int a) {
		// TODO Auto-generated method stub
		System.out.println(a);
	}

}
