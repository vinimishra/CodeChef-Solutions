import java.util.Scanner;

class EnormousInputTest {
	public static void main(String[] args) {
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			int num = scanner.nextInt();
			if (num % k == 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
