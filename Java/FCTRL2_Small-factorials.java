import java.math.BigInteger;
import java.util.Scanner;

class SmallFactorials {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		while (testCase-- != 0) {
			int number = scanner.nextInt();
			BigInteger fact = BigInteger.ONE;
			for (int i = 1; i <= number; i++) {
				fact = fact.multiply(BigInteger.valueOf(i));
			}
			System.out.println(fact);
		}
	}
}
