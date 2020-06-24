import java.util.Arrays;
import java.util.Scanner;

class TheSmallestPair {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		while (testCase-- != 0) {
			int num = scanner.nextInt();
			int[] elements = new int[num];
			for (int i = 0; i < num; i++) {
				elements[i] = scanner.nextInt();
			}
			Arrays.sort(elements);
			System.out.println(elements[0] + elements[1]);
		}
	}
}
