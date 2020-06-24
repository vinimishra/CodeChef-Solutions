import java.util.Scanner;

class ChefAndNotebooks {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		while (testCase-- != 0) {
			int poemLength = scanner.nextInt();
			int pagesLeft = scanner.nextInt();
			int moneyInHand = scanner.nextInt();
			int noOfNoteBookAvaliable = scanner.nextInt();

			int pagesNeeded = poemLength - pagesLeft;
			int[] pagesInNotebook = new int[noOfNoteBookAvaliable];
			int[] costOfNotebook = new int[noOfNoteBookAvaliable];

			for (int i = 0; i < noOfNoteBookAvaliable; i++) {
				pagesInNotebook[i] = scanner.nextInt();
				costOfNotebook[i] = scanner.nextInt();
			}

			int flag = 0;
			for (int i = 0; i < noOfNoteBookAvaliable; i++) {
				if ((pagesInNotebook[i] >= pagesNeeded) && (costOfNotebook[i] <= moneyInHand)) {
					flag++;
				}
			}
			if (flag == 0)
				System.out.println("UnluckyChef");
			else
				System.out.println("LuckyChef");
		}
	}

}
