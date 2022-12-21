package inheritancePackage;



abstract class Car{ // cannot be instantiated 
	final int wheels = 4;
	public Car() {
		System.out.println("This is Car constructor");
	}
	
	public void vechileType() {
		System.out.println("Type Car");
	}
}

abstract class Maruti extends Car{ // Maruti extends all the properties of the Car
	
	public Maruti() {
		System.out.println("This is Maruti Constructor");
	}
	
	public void brand() {
		System.out.println("Brand Suzuki");
	}
	
	public void speed() {
		System.out.println("90 km/hr");
	}
	
	
}
class Maruti800 extends Maruti{
	public Maruti800() {
		System.out.println("This is Maruti800 constructor");
	}
	//Runtime polymorphism
	@Override
	public void speed()
	{
		System.out.println("120 km/hr");
	}	
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		Maruti800 car1 = new Maruti800();
		System.out.println("Number of wheels = " + car1.wheels);
		car1.vechileType();
		car1.brand();
		car1.speed();
	}
}
