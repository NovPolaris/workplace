import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a, b;
		System.out.println("请输入两个数字并以空格分隔：");
		String input1 = scanner.next();
		String input2 = scanner.next();
		try {
			a = Double.parseDouble(input1);
			b = Double.parseDouble(input2);
			if (a < b) {
				System.out.println("<");
			} else if (a > b) {
				System.out.println(">");
			} else {
				System.out.println("=");
			}
		} catch(Exception ex) {
			System.out.println("输入值不合法！");
		}
	}
}