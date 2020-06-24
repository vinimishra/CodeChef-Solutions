import java.util.Scanner;

class ATM {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int withdrawAmount = scanner.nextInt();
		double availableBalance = scanner.nextDouble();

		if ((withdrawAmount % 5 == 0) && ((withdrawAmount + 0.50) <= availableBalance)) {
			System.out.printf("%.2f", availableBalance - (withdrawAmount + 0.50));
		} else {
			System.out.printf("%.2f", availableBalance);
		}

	}
}
