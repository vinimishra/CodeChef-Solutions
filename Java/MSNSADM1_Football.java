import java.util.Arrays;
import java.util.Scanner;

class Football_MSNSADM1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		while (testCase-- != 0) {
			int num = scanner.nextInt();
			int[] goals = new int[num];
			int[] fouls = new int[num];
			for (int i = 0; i < num; i++) {
				goals[i] = scanner.nextInt();
			}
			for (int i = 0; i < num; i++) {
				fouls[i] = scanner.nextInt();
			}
			int[] results = new int[num];
			for (int i = 0; i < num; i++) {
				if ((goals[i] * 20) - (fouls[i] * 10) > 0) {
					results[i] = (goals[i] * 20) - (fouls[i] * 10);
				} else {
					results[i] = 0;
				}
			}
			Arrays.sort(results);
			System.out.println(results[num - 1]);
		}

	}

}
