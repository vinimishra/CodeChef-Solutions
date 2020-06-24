import java.util.Scanner;

class ThatIsMyScore_WATSCORE {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		while (testCase-- != 0) {
			int num = scanner.nextInt();
			int[] a = new int[num];
			int[] b = new int[num];
			for (int i = 0; i < num; i++) {
				a[i] = scanner.nextInt();
				b[i] = scanner.nextInt();
			}

			for (int i = 0; i < num; i++) {
				for (int j = i + 1; j < num; j++) {
					if ((a[i] == a[j])) {
						if (b[i] <= b[j]) {
							b[i] = 0;
						} else {
							b[j] = 0;
						}
					}
				}
			}

			int sum = 0;
			for (int i = 0; i < num; i++) {
				if ((a[i] == 9) || (a[i] == 10) || (a[i] == 11)) {
					continue;
				} else {
					sum += b[i];
				}
			}

			System.out.println(sum);
		}

	}

}
