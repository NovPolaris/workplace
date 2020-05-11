public class Test02 {
	public static void main(String[] args) {
		int result = 1;
		for (int i = 10; i > 0; i--) {
			result = (result + 1) * 2;
		}
		System.out.println("猴子第一天一共摘了" + result + "个桃子");
	}
}