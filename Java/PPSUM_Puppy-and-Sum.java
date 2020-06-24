import java.util.Scanner;

class PuppyAndSum {

	public static int sum(int number) {
		if (number == 0)
			return number;
		return number + sum(number - 1);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		while (testCase-- != 0) {
			int d = scanner.nextInt();
			int n = scanner.nextInt();
			int number = n;
			while (d-- != 0) {
				number = sum(number);
			}
			System.out.println(number);
		}
	}
}
