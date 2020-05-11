import java.util.Scanner;

public class Test04 {
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
		if (number == 0) {
			System.out.println("0不是质数");
		} else if (number == 1) {
			System.out.println("1是质数");
		} else {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					System.out.println(number + "不是质数");
					return;
				}
			}
			System.out.println(number + "是质数");
		}
	}
}