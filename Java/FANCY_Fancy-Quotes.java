import java.util.Scanner;

class FancyQuotes {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int testCase = scanner.nextInt();
		scanner.nextLine();

		while (testCase-- != 0) {
			String sentence = scanner.nextLine();
			String[] words = sentence.split(" ");

			int count = 0;
			for (int i = 0; i < words.length; i++) {
				if (words[i].equals("not") == true) {
					count++;
				}
			}

			if (count != 0) {
				System.out.println("Real Fancy");
			} else {
				System.out.println("regularly fancy");
			}
		}
	}
}
