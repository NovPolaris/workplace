import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入里程：");
		String input = scanner.next();
		int mileage;
		try {
			mileage = Integer.parseInt(input);
		} catch(Exception ex) {
			System.out.println("输入不合法！");
			return;
		}
		int sum = 0;
		if (mileage <= 3) {
			System.out.println("总价：8元");
		} else if (mileage <= 5) {
			System.out.println("总价：" + (8 + 1.2 * (mileage - 3)));
		} else {
			System.out.println("总价：" + (10.4 + 1.5 * (mileage - 5)));
		}
	}
}