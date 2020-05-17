public class Test01 {
	public static void main(String[] args) {
		int x = 10;
		int a = x + x++;
		System.out.println("a=" + a); // a=20
		System.out.println("x=" + x); // x=11
		int b = x + ++x;
		System.out.println("b=" + b); // a=23
		System.out.println("x=" + x); // x=12
		int c = x + x--;
		System.out.println("c=" + c); // a=24
		System.out.println("x=" + x); // x=11
		int d = x + --x;
		System.out.println("d=" + d); // a=21
		System.out.println("x=" + x); // x=10
	}
}