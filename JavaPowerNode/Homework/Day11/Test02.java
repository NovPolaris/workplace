import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入一个不大于100的正整数：");
		String input = scanner.next();
		int number;

		try {
			number = Integer.parseInt(input);
		} catch(Exception ex) {
			System.out.println("输入不合法！");
			return;
		}

		if (number < 1 || number > 100) {
			System.out.println("输入不合法！");
			return;
		}

		leastLargerPrime(number);
	}

	private static void leastLargerPrime(int number) {
		long curt = (long) number + 1;
		while (true) {
			if (isPrime(curt)) {
				System.out.println("大于" + number + "的最小的质数是：" + curt);
				return;
			}
			curt++;
		}
	}

	private static boolean isPrime(long curt) {
		for (int i = 2; i < curt; i++) {
			if (curt % i == 0) {
				return false;
			}
		}
		return true;
	}
}