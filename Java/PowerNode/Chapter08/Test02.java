public class Test02 {
}

class Man {
	private String id;
	private String name;
	private String gender;
	private Woman woman;

	public Man(String id, String name, String gender, Woman woman) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.woman = woman;
	}
}

class Woman {
	private String id;
	private String name;
	private String gender;
	private Man man;

	public Woman(String id, String name, String gender, Man man) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.man = man;
	}
}