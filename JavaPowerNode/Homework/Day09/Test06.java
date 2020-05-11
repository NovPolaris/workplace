public class Test06 {
	public static void main(String[] args) {
		int sum = 0, day = 0;
		while (sum < 100) {
			day++;
			sum += 2.5;
			if (day % 5 == 0) {
				sum -= 6;
			}
		}

		System.out.println("第" + day + "天，小芳存到了" + sum + "元");
	}
}