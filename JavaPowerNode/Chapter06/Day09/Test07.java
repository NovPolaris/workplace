public class Test07 {
	public static void main(String[] args) {
		System.out.println("1000以内所有的完数：");
		for (int i = 0; i < 1000; i++) {
			int sum = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}
			if (sum == i) {
				System.out.println(sum);
			}
		}
	}
}