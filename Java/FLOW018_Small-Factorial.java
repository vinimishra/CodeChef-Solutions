import java.util.Scanner;

class SmallFactorial {
	public static int factorial(int number) {
		if (number == 0 || number == 1)
			return 1;
		return number * factorial(number - 1);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		while (testCase-- != 0) {
			int number = scanner.nextInt();
			int factorialOfNumber = factorial(number);
			System.out.println(factorialOfNumber);
		}
	}
}
