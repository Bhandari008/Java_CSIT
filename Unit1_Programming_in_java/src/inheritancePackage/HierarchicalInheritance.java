package inheritancePackage;

class Animal {
	final int legs = 4;

	public void eat() {
		System.out.println("I eat food");
	}

}

class Tiger extends Animal {
	public void roar() {
		System.out.println("I say roar");
	}

	@Override
	public void eat() {
		System.out.println("I only eat meat.");
	}
}

class Cow extends Animal {

	public void moo() {
		System.out.println("I say moo");
	}

	@Override
	public void eat() {
		System.out.println("I only eat grass.");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {		
		Tiger t = new Tiger();
		System.out.println("Tiger Object");
		System.out.println("Tiger has " + t.legs + " legs.");
		t.eat();
		t.roar();
		Cow c = new Cow();
		System.out.println("Cow Object");
		System.out.println("Cow has " + c.legs + " legs.");
		c.eat();
		c.moo();

	}

}
