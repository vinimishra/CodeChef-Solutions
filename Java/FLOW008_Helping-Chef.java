import java.util.Scanner;

class Servant {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		while (testCase-- != 0) {
			int number = scanner.nextInt();
			if (number < 10)
				System.out.println("What an obedient servant you are!");
			else
				System.out.println("-1");
		}
	}
}
