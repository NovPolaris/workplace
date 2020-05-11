import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入月份（1 - 12）：");
		String input = scanner.next();
		try {
			int month = Integer.parseInt(input);
			if (month < 1 || month > 12) {
				System.out.println("输入值不合法！");
				return;
			}
			if (month < 3 || month == 12) {
				System.out.println("冬季");
			} else if (month < 6) {
				System.out.println("春季");
			} else if (month < 9) {
				System.out.println("夏季");
			} else {
				System.out.println("秋季");
			}
		} catch(Exception ex) {
			System.out.println("输入值不合法！");
		}

		try {
			int month = Integer.parseInt(input);
			if (month < 1 || month > 12) {
				System.out.println("输入值不合法！");
				return;
			}
			switch(month) {
			case 3: case 4: case 5:
				System.out.println("春季");
				break;
			case 6: case 7: case 8:
				System.out.println("夏季");
				break;
			case 9: case 10: case 11:
				System.out.println("秋季");
				break;
			default:
				System.out.println("冬季");
			}
		} catch(Exception ex) {
			System.out.println("输入值不合法！");
		}
	}
}