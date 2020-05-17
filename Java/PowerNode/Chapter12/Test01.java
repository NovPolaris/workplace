public class Test01 {

}

class Organism {
	String name;
	String gender;

	public void speak() {
		System.out.println("生物说话");
	}
}
class Monkey extends Organism {
	@Override
	public void speak() {
		System.out.println("猴子说话");
	}
}

class Human extends Organism {
	@Override
	public void speak() {
		System.out.println("人类说话");
	}	
}