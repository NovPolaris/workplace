import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入一个数字：");
		String input = scanner.next();
		try {
			double number = Double.parseDouble(input);
			if (number % 2 == 1) {
				System.out.println("奇数");
			} else {
				System.out.println("偶数");
			}
		} catch(Exception ex) {
			System.out.println("输入值不合法！");
		}
	}
}