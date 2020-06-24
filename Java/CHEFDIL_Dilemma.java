import java.util.Scanner;

class Dilemma_CHEFDIL {

	public static int[] flip(int[] cards, int length) {
		for (int i = 0; i < length; i++) {
			if (cards[i] == 1) {
				cards[i] = -1;
				if (i != length - 1) {
					if (cards[i + 1] == 1)
						cards[i + 1] = 0;
					else if (cards[i + 1] == 0)
						cards[i + 1] = 1;
				}
				if (i != 0) {
					if (cards[i - 1] == 1)
						cards[i - 1] = 0;
					else if (cards[i - 1] == 0)
						cards[i - 1] = 1;
				}
			}
		}
		return cards;

	}

	private static int checkForCard(int[] cards) {
		for (int i = 0; i < cards.length; i++) {
			if (cards[i] == 1)
				return 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		while (testCase-- != 0) {
			String str = scanner.next();
			scanner.nextLine();
			int length = str.length();
			int[] cards = new int[length];
			for (int i = 0; i < length; i++) {
				cards[i] = str.charAt(i) - '0';
			}

			int[] flipedCards;
			do {
				flipedCards = flip(cards, length);
				for (int i = 0; i < flipedCards.length; i++) {
				}
			} while (checkForCard(flipedCards) != 0);

			int count = 0;
			for (int i = 0; i < length; i++) {
				if (cards[i] == -1)
					count++;
			}
			if (count == length)
				System.out.println("WIN");
			else
				System.out.println("LOSE");
		}
	}

}
