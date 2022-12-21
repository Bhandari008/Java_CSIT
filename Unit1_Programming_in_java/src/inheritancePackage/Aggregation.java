package inheritancePackage;

class Date {
	int year, month, day;

	public Date(int year, int month, int day) {

		this.year = year;
		this.month = month;
		this.day = day;
	}
}

class Address {
	String city, state, country;

	public Address(String city, String state, String country) {
		// TODO Auto-generated constructor stub
		this.city = city;
		this.state = state;
		this.country = country;
	}

}

class Student {
	int id;
	String name;
	Address add;
	Date dob;
	Date joinDate;
	Date endDate;

	public Student(int id, String name, Address add, Date joinDate, Date endDate, Date dob) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.add = add;
		this.joinDate = joinDate;
		this.endDate = endDate;
		this.dob = dob;
	}

	public void display() {
		System.out.println("id = " + id);
		System.out.println("name = " + name);
		System.out.println("city = " + add.city);
		System.out.println("state = " + add.state);
		System.out.println("country = " + add.country);
		System.out.println("Join Date = " + joinDate.day + "/" + joinDate.month + "/" + joinDate.year);
		System.out.println("End Date = " + endDate.day + "/" + endDate.month + "/" + endDate.year);
		System.out.println("DOB = " + dob.day + "/" + dob.month + "/" + dob.year);
	}
}

public class Aggregation {

	public static void main(String[] args) {
		Date joinDate = new Date(1,12,2013);
		Date dob = new Date(1,12,2000);
		Date endDate = new Date(2,12, 2022);
		Address ad = new Address("Ktm", "Bagmati", "Nepal");
		Student s1 = new Student(1, "Hari", ad, joinDate, endDate, dob);
		s1.display();
	}

}
