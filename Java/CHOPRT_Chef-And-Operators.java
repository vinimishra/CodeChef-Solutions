import java.util.Scanner;

class ChefAndOperators {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		while (testCase-- != 0) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			if (a > b) {
				System.out.println(">");
			} else if (b > a) {
				System.out.println("<");
			} else {
				System.out.println("=");
			}
		}
	}
}
