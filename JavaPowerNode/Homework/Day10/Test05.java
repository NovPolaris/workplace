public class Test05 {
	public static void main(String[] args) {
		for (int i = 1000; i < 10000; i++) {
			if (i == 3 * (i % 1000)) {
				System.out.println("这个四位数是：" + i);
				return;
			}
		}
		System.out.println("找不到这样的四位数！");
	}
}