import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入一个正整数：");
		String input = scanner.next();
		int number, result = 1;

		try {
			number = Integer.parseInt(input);
		} catch(Exception ex) {
			System.out.println("输入不合法！");
			return;
		}
		
		if (result < 1) {
			System.out.println("输入不合法！");
		}

		for (int i = number; i > 0; i--) {
			result *= i;
		}

		System.out.println(number + "的阶乘为：" + result);
	}
}