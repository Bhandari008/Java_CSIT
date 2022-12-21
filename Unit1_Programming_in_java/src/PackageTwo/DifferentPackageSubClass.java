package PackageTwo;
import PackageOne.ProtectionLevel;

public class DifferentPackageSubClass extends ProtectionLevel  {
	public DifferentPackageSubClass() {
		// TODO Auto-generated constructor stub
		//System.out.println("Default number = " + num);
		//System.out.println("Private number = " + numPrivate);
		System.out.println("Protected number = " + numProtected);
		System.out.println("Public number = " + numPublic);
	}
}
