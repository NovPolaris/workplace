public class Test03 {
	public static void main(String[] args) {
		int result = 0;
		for (int i = 10; i > 0; i--) {
			result = (result + 1) * i;
		}

		System.out.println("1! + 2! + 3! + 4! + ... + 10! = " + result);
	}
}