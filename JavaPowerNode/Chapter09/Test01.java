public class Test01 {
	public static void main(String[] args) {
		Husband husband = new Husband("111-1111-11", "Jack", "2020-01-01");
		Wife wife = new Wife("222-2222-22", "Rose", "2020-02-02");
		husband.wife = wife;
		wife.husband = husband;

		System.out.println("The name of " + husband.name + "'s wife is " + husband.wife.name);
		System.out.println("The name of " + wife.name + "'s husband is " + wife.husband.name);
	}
}

class Husband {
	String id;
	String name;
	String birthDate;
	Wife wife;

	public Husband() {

	}

	public Husband(String id, String name, String birthDate) {
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}

	public Husband(String id, String name, String birthDate, Wife wife) {
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		this.wife = wife;
	}
}

class Wife {
	String id;
	String name;
	String birthDate;
	Husband husband;

	public Wife() {

	}

	public Wife(String id, String name, String birthDate) {
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		this.husband = null;
	}

	public Wife(String id, String name, String birthDate, Husband husband) {
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		this.husband = husband;
	}
}