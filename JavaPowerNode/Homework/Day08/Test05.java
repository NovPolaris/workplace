import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入三个数字：");

		String s1 = scanner.next();
		String s2 = scanner.next();
		String s3 = scanner.next();
		int num1, num2, num3;

		try {
			num1 = Integer.parseInt(s1);
			num2 = Integer.parseInt(s2);
			num3 = Integer.parseInt(s3);
		} catch(Exception ex) {
			System.out.println("输入不合法！");
			return;
		}

		if (num1 <= num2) {
			if (num2 <= num3) {
				System.out.println(num1 + " " + num2 + " " + num3);
			} else if (num1 <= num3) {
				System.out.println(num1 + " " + num3 + " " + num2);
			} else {
				System.out.println(num3 + " " + num1 + " " + num2);
			}
		} else {
			if (num1 <= num3) {
				System.out.println(num2 + " " + num1 + " " + num3);
			} else if (num2 <= num3) {
				System.out.println(num2 + " " + num3 + " " + num1);
			} else {
				System.out.println(num3 + " " + num2 + " " + num1);
			}
		}
	}
}