public class Test01 {
	public static void main(String[] args) {
		int[] ids = new int[]{110, 120};
		String[] names = new String[]{"张三", "李四"};
		char[] sexes = new char[]{'男', '女'};
		double[] heights = new double[]{1.85, 1.65};

		for (int i = 0; i < 2; i++) {
			System.out.println("学号：" + ids[i]);
			System.out.println("姓名：" + names[i]);
			System.out.println("性别：" + sexes[i]);
			System.out.println("身高：" + heights[i]);
			if (i == 0) {
				System.out.println("----------------------");
			}
		}
	}
}