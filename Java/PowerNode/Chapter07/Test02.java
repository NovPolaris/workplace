import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入用户名：");
		String username = scanner.next();
		System.out.print("请输入密码：");
		String password = scanner.next();

		if (isValid(username, password)) {
			System.out.println("欢迎" + username);
		} else {
			System.out.println("用户名或密码不正确");
		}
	}

	private static boolean isValid(String username, String password) {
		return username.equals("admin") && password.equals("123");
	}
}