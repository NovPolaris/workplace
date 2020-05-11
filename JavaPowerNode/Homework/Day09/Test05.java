import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入一个正整数：");
		String input = scanner.next();
		int number;

		try {
			number = Integer.parseInt(input);
		} catch(Exception ex) {
			System.out.println("输入不合法！");
			return;
		}

		if (number < 1) {
			System.out.println("输入不合法！");
		} else {
			for (int i = 1; i <= number; i++) {
				for (int j = 0; j < 2 * i - 1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}