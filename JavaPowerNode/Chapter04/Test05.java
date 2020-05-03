public class Test05 {
	public static void main(String[] args) {
		int i = 5;
		int j = 5;
		int m = 5;
		int n = 5;
		i++;
		j = j + 1;
		m--;
		n = n - 1;
		System.out.println(i);   // 6
		System.out.println(i++); // 6
		System.out.println(++i); // 8
		System.out.println(i--); // 8
		System.out.println();    // 
		System.out.println(j);   // 6
		System.out.println(j++); // 6
		System.out.println(j--); // 7
		System.out.println(--j); // 5
		System.out.println();    // 
		System.out.println(m);   // 4
		System.out.println(n);   // 4
	}
}