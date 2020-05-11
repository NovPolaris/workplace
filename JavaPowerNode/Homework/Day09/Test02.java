public class Test02 {
	public static void main(String[] args) {
		int temp = 1, result = 1;
		for (int i = 2; i <= 100; i++) {
			result += i * temp;
			temp *= -1;
		}
		System.out.println("和：" + result);
	}
}