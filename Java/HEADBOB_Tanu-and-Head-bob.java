import java.util.Scanner;

class TanuAndHeadBob {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int testCase = scanner.nextInt();
		while (testCase-- != 0) {
			int n = scanner.nextInt();
			scanner.nextLine();
			boolean found = false;
			String word = scanner.nextLine();
			for (int i = 0; i < word.length(); i++) {
				if (word.charAt(i) == 'I') {
					found = true;
					System.out.println("INDIAN");
					break;
				} else if (word.charAt(i) == 'Y') {
					found = true;
					System.out.println("NOT INDIAN");
					break;
				}
			}

			if (found == false) {
				System.out.println("NOT SURE");
			}
		}
	}
}
