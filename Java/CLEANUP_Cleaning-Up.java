import java.util.Arrays;
import java.util.Scanner;

class CleaningUp_CLEANUP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int testCase = scanner.nextInt();
		while (testCase-- != 0) {
			int nTotalSpace = scanner.nextInt();
			int totalSpace[] = new int[nTotalSpace];

			int nCleanedSpace = scanner.nextInt();
			int cleanedSpace[] = new int[nCleanedSpace];
			for (int i = 0; i < nCleanedSpace; i++) {
				cleanedSpace[i] = scanner.nextInt();
			}

			for (int i = 0; i < nTotalSpace; i++) {
				for (int j = 0; j < nCleanedSpace; j++) {
					if ((i + 1) == cleanedSpace[j]) {
						totalSpace[i] = 1;
					}
				}
			}

			int uncleanedSpaces[] = new int[nTotalSpace - nCleanedSpace];
			int k = 0;
			for (int i = 0; i < nTotalSpace; i++) {
				if (totalSpace[i] != 1) {
					uncleanedSpaces[k] = (i + 1);
					k++;
				}
			}

			for (int i = 0; i < uncleanedSpaces.length; i += 2)
				System.out.print(uncleanedSpaces[i] + " ");
			System.out.println();

			for (int i = 1; i < uncleanedSpaces.length; i += 2)
				System.out.print(uncleanedSpaces[i] + " ");
			System.out.println();
		}

	}

}
