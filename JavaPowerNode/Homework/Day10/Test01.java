import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入一个五位数：");
		String input = scanner.next();
		int number;

		try {
			number = Integer.parseInt(input);
		} catch(Exception ex) {
			System.out.println("输入不合法！");
			return;
		}

		if (number < 10000 || number > 99999) {
			System.out.println("输入不合法！");
			return;	
		}

		int temp = number, reverse = 0;

		while (temp > 0) {
			int digit = temp % 10;
			reverse = reverse * 10 + digit;
			temp /= 10;
		}

		if (reverse == number) {
			System.out.println(number + "是回文数");
		} else {
			System.out.println(number + "不是回文数");
		}
	}
}