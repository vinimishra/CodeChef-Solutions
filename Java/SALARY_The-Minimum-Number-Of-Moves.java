import java.util.Scanner;

class TheMinimumNumberOfMoves {

	public static int makeSalaryEqual(int[] salariesOfWorkers, int countMoves) {
		int checkSalary = isSalaryEqual(salariesOfWorkers);
		if (checkSalary == 0) {
			return countMoves;
		} else {
			int highestSalary = salariesOfWorkers[0];
			for (int i = 1; i < salariesOfWorkers.length; i++) {
				if (salariesOfWorkers[i] > highestSalary)
					highestSalary = salariesOfWorkers[i];
			}
			for (int i = 0; i < salariesOfWorkers.length; i++) {
				if (salariesOfWorkers[i] != highestSalary)
					continue;
				salariesOfWorkers[i]--;
				countMoves++;
			}
			return makeSalaryEqual(salariesOfWorkers, countMoves);
		}
	}

	public static int isSalaryEqual(int[] salariesOfWorkers) {
		int first = salariesOfWorkers[0];
		for (int i = 1; i < salariesOfWorkers.length; i++) {
			if (salariesOfWorkers[i] != first) {
				return -1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		while (testCase-- != 0) {
			int noOfWorkers = scanner.nextInt();
			int[] salariesOfWorkers = new int[noOfWorkers];
			for (int i = 0; i < noOfWorkers; i++) {
				salariesOfWorkers[i] = scanner.nextInt();
			}
			int moves = makeSalaryEqual(salariesOfWorkers, 0);
			System.out.println(moves);

		}
	}
}
