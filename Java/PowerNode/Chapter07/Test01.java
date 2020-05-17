import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入一个不大于10的正整数：");
		String input = scanner.next();
		int number;

		try {
			number = Integer.parseInt(input);
		} catch(Exception ex) {
			System.out.println("输入不合法！");
			return;
		}

		if (number < 1 || number > 10) {
			System.out.println("输入不合法！");
			return;
		}

		System.out.println(number + "的阶乘是：" + helper(number));
	}

	private static int helper(int number) {
		if (number == 1) {
			return 1;
		}
		return number * helper(number - 1);
	}
}