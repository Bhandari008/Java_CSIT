package InnerClass;


public class StaticInnerClass {
	
	private static int number = 100000;
	static class Inner{
		
		public void access() {
			System.out.println("The amount is = Rs" + number);
		}
	}
	public static void main(String[] args) {
//		StaticInnerClass oc = new StaticInnerClass();
		Inner ic =  new StaticInnerClass.Inner();
		ic.access();
//		oc.access();

	}

}