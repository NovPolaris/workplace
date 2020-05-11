import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入一个不大于100的正整数：");
		String input = scanner.next();
		int number;

		try {
			number = Integer.parseInt(input);
		} catch(Exception ex) {
			System.out.println("输入不合法！");
			return;
		}

		if (number < 1 || number > 100) {
			System.out.println("输入不合法！");
			return;
		}

		power(number);
	}

	private static void power(int number) {
		long result = 1;
		for (int i = 2; i <= number; i++) {
			result *= i;
		}

		System.out.println(number + "的阶乘为：" + result);
	}
}