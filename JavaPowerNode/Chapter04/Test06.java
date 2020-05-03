public class Test06 {
	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		System.out.println(i);   // 0
		System.out.println(j);   // 0
		i++;
		++j;
		System.out.println(i);   // 1
		System.out.println(j);   // 1
		System.out.println("---------------------");
		System.out.println(i++); // 1
		System.out.println(++j); // 2
		System.out.println("---------------------");
		System.out.println(i);   // 2
		System.out.println(j);   // 2
	}
}