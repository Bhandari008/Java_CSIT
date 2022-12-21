package PackageOne;

public class SamePackageNonSubClass {

	public SamePackageNonSubClass() {
		ProtectionLevel p = new ProtectionLevel();
		System.out.println("Default number = " + p.num);
		// System.out.println("Private number = " + p.numPrivate);
		System.out.println("Protected number = " + p.numProtected);
		System.out.println("Public number = " + p.numPublic);
	}
}
