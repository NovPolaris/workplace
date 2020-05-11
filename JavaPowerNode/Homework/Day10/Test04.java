public class Test04 {
	public static void main(String[] args) {
		int height = 100, result = 0;

		for (int i = 0; i < 10; i++) {
			result += height * 2;
			height /= 2;
		}
		result -= height * 2;
		System.out.println("它在第10次落地时，共经过" + result + "米");
	}
}