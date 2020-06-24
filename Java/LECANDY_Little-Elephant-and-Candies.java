import java.util.Scanner;
import java.util.stream.IntStream;

class LittleElephantAndCandies {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		while (testCase-- != 0) {
			int numberOfElephants = scanner.nextInt();
			int numberofCandies = scanner.nextInt();
			int[] candyNeeded = new int[numberOfElephants];
			for (int i = 0; i < numberOfElephants; i++) {
				candyNeeded[i] = scanner.nextInt();
			}

			int candyRequired = IntStream.of(candyNeeded).sum();
			if (candyRequired > numberofCandies)
				System.out.println("No");
			else
				System.out.println("Yes");
		}
	}
}
