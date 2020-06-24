import java.util.Scanner;

class SumOfDigits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		while (testCase-- != 0) {
			int number = scanner.nextInt();
			int sum = 0;
			while (number != 0) {
				sum = sum + (number % 10);
				number /= 10;
			}
			System.out.println(sum);
		}
	}
}
