public class Test01 {
	public static int k = 0;
	public static Test01 t1 = new Test01("t1");
	public static Test01 t2 = new Test01("t2");
	public static int i = print("i");
	public static int n = 99;
	public int j = print("j");
	static {
		print("静态块");
	}
	public Test01(String str) {
		System.out.println((++k) + ":" + str + " i=" + i + " n=" + n);
		++i;
		++n;
	}
	public static int print(String str) {
		System.out.println((++k) + ":" + str + " i=" + i + " n=" + n);
		++n;
		return ++i;
	}
	public static void main(String args[]) {
		new Test01("init");
	}
}