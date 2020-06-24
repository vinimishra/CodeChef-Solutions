import java.util.Scanner;

class ChefAndFruits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		while (testCase-- != 0) {
			int n, m, k;
			n = scanner.nextInt();
			m = scanner.nextInt();
			k = scanner.nextInt();
			int diff = Math.abs(n - m);
			if (diff > 0 && diff <= k) {
				diff = 0;
			} else if (diff > 0 && k < diff) {
				diff -= k;
			}
			System.out.println(diff);
		}
	}
}
