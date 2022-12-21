package PackageOne;

public class SamePackageSubClass extends ProtectionLevel {
	
	public SamePackageSubClass() {
		System.out.println("Default number = " + num);
		// System.out.println("Private number = " + numPrivate);
		System.out.println("Protected number = " + numProtected);
		System.out.println("Public number = " + numPublic);
		
	}
	
}
