import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入一个不多于五位的正整数：");
		String input = scanner.next();
		int number;

		try {
			number = Integer.parseInt(input);
		} catch(Exception ex) {
			System.out.println("输入不合法！");
			return;
		}
		if (number < 1 || number >= 100000) {
			System.out.println("输入不合法！");
		} else {
			int count = 0, result = 0, output = number;
			while (number > 0) {
				int temp = number % 10;
				count++;
				result = result * 10 + temp;
				number /= 10;
			}
			System.out.println(output + "是" + count + "位数");
			System.out.println("逆序输出：" + result);
		}
	}
}