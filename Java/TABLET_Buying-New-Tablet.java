import java.util.Arrays;
import java.util.Scanner;

class BuyingNewTablet {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int testCase = scanner.nextInt();

		while (testCase-- != 0) {

			int n = scanner.nextInt();
			int b = scanner.nextInt();

			int[] w = new int[n];
			int[] h = new int[n];
			int[] p = new int[n];

			for (int i = 0; i < n; i++) {
				w[i] = scanner.nextInt();
				h[i] = scanner.nextInt();
				p[i] = scanner.nextInt();
			}

			int[] screenSize = new int[n];
			for (int i = 0; i < n; i++) {
				if (p[i] > b) {
					screenSize[i] = 0;
				} else {
					screenSize[i] = w[i] * h[i];
				}
			}

			int noTablet = 0;
			for (int i = 0; i < screenSize.length; i++) {
				if (screenSize[i] == 0) {
					noTablet++;
				}
			}
			Arrays.sort(screenSize);
			if (noTablet == n) {
				System.out.println("no tablet");
			} else {
				System.out.println(screenSize[n - 1]);
			}
		}
	}
}
