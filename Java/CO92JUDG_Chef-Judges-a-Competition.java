import java.util.Arrays;
import java.util.Scanner;

class ChefJudgesACompetition {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		while (testCase-- != 0) {
			int n = scanner.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];
			int totalOfA = 0, totalOfB = 0;
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();
			}
			for (int i = 0; i < n; i++) {
				b[i] = scanner.nextInt();
			}
			Arrays.sort(a);
			Arrays.sort(b);
			a[n - 1] = 0;
			b[n - 1] = 0;
			for (int i = 0; i < n; i++) {
				totalOfA += a[i];
				totalOfB += b[i];
			}
			if (totalOfA > totalOfB) {
				System.out.println("Bob");
			} else if (totalOfB > totalOfA) {
				System.out.println("Alice");
			} else {
				System.out.println("Draw");
			}
		}
	}
}
