import java.util.Scanner;

class GrossSalary {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();

		while (testCase-- != 0) {
			int basicSalary = scanner.nextInt();

			double hra = (basicSalary / 10.0);
			double da = ((basicSalary * 9) / 10.0);

			if (basicSalary >= 1500) {
				hra = 500.0;
				da = ((basicSalary * 98) / 100.0);
			}
			double grossSalary = basicSalary + hra + da;

			System.out.format("%.2f", grossSalary);
			System.out.println();
		}
	}
}
