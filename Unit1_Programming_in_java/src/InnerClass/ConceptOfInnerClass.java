package InnerClass;

public class ConceptOfInnerClass {
	
	private int number = 100000;
	class Inner{
		
		public void access() {
			System.out.println("The amount is = Rs" + number);
		}
	}
	public static void main(String[] args) {
		ConceptOfInnerClass oc = new ConceptOfInnerClass();
		ConceptOfInnerClass.Inner ic = oc.new Inner();
		ic.access();

	}

}

// Static Inner Class Example
