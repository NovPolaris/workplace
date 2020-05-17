public class Test01 {
	static int value = 9;

	public static void main(String[] args) throws Exception {
		new Test().printValue();
	}

	public void printValue() {
		int value = 69;
		System.out.println(this.value);
	}
}