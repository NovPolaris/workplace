import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入一个数字：");
		String input = scanner.next();
		try {
			double number = Double.parseDouble(input);
			if (number < 0) {
				System.out.println("负数");
			} else if (number > 0) {
				System.out.println("正数");
			} else {
				System.out.println("零");
			}
		} catch(Exception ex) {
			System.out.println("输入值不合法！");
		}
	}
}