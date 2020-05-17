public class Test01 {
}

class Human {
	private String name;
	private String gender;
	private int age;

	public Human() {

	}

	public Human(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public String getGender() {
		return this.gender;
	}

	public int getAge() {
		return this.age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setAge(int age) {
		if (age < 0 || age > 100) {
			throw new RuntimeException("年龄值不合法！");
		}
		this.age = age;
	}
}