public class Test01 {
	public static void main(String[] args) {
		Bird bird1 = new RedBird();
		Bird bird2 = new BlueBird();
		Bird bird3 = new YellowBird();
		Slingshot slingshot = new Slingshot();
		slingshot.bird = bird1;
		slingshot.shot();
		slingshot.bird = bird2;
		slingshot.shot();
		slingshot.bird = bird3;
		slingshot.shot();
	}
}

class Bird {
	String color;

	public Bird(String color) {
		this.color = color;
	}

	public void move() {
		System.out.println("小鸟飞");
	}
}

class RedBird extends Bird {
	public RedBird() {
		super("红色");
	}

	public void move() {
		System.out.println(color + "小鸟正常飞");
	}
}

class BlueBird extends Bird {
	public BlueBird() {
		super("蓝色");
	}
	
	public void move() {
		System.out.println(color + "小鸟分成三个飞");
	}
}

class YellowBird extends Bird {
	public YellowBird() {
		super("黄色");
	}
	
	public void move() {
		System.out.println(color + "小鸟加速飞");
	}
}

class Slingshot {
	Bird bird;

	public void shot() {
		System.out.print("弹出" + bird.color + "小鸟，");
		bird.move();
	}
}