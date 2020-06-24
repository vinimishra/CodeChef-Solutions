import java.util.Scanner;

class KitchenTimetable {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int testCase = scanner.nextInt();

		while (testCase-- != 0) {
			Integer n = scanner.nextInt();

			Integer[] a = new Integer[n];
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();
			}

			Integer[] b = new Integer[n];
			for (int i = 0; i < n; i++) {
				b[i] = scanner.nextInt();
			}

			Integer[] timeLimit = new Integer[n];
			timeLimit[0] = a[0];
			for (int i = 0; i < n - 1; i++) {
				timeLimit[i + 1] = a[i + 1] - a[i];
			}

			int count = 0;
			for (int i = 0; i < n; i++) {
				if (timeLimit[i] >= b[i]) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
