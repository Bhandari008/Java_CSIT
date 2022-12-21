package PackageOne;

public class ProtectionLevel {
	
	int num = 24; // no modifier
	private int numPrivate = 34;
	protected int numProtected = 44;
	public int numPublic = 94;
	
	
	public ProtectionLevel() {
		System.out.println("Default number = " + num);
		System.out.println("Private number = " + numPrivate);
		System.out.println("Protected number = " + numProtected);
		System.out.println("Public number = " + numPublic);
		
	}	
}




//public static void main(String[] args) {
//	
//	new ProtectionLevel();
//}
