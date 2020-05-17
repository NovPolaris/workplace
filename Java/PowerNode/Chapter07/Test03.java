public class Test03 {
	public static void main(String[] args) {
		System.out.println("1和2的最大值是：" + max(1, 2));
		System.out.println("1, 2和3的最大值是：" + max(1, 2, 3));
	}

	private static int max(int a, int b) {
		return a >= b ? a : b;
	}

	private static int max(int a, int b, int c) {
		return max(a, max(b, c));
	}
}