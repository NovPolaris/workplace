public class Test02 {

}

class Animal {
	String name;
	String gender;

	public void move() {
		System.out.println("动物移动");
	}
}
class Fish extends Animal {
	@Override
	public void move() {
		System.out.println("鱼儿移动");
	}
}