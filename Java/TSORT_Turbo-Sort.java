import java.util.Arrays;
import java.util.Scanner;

class TurboSort {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arrSize = scanner.nextInt();
		int numbers[] = new int[arrSize];
		for (int i = 0; i < arrSize; i++) {
			numbers[i] = scanner.nextInt();
		}
		Arrays.sort(numbers);
		for (int i = 0; i < arrSize; i++) {
			System.out.println(numbers[i]);
		}
	}
}
