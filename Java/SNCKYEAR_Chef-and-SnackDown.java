import java.util.Scanner;

class ChefAndSnackDown {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		while (testCase-- != 0) {
			int year = scanner.nextInt();
			switch (year) {
			case 2010:
			case 2015:
			case 2016:
			case 2017:
			case 2019:
				System.out.println("HOSTED");
				break;

			default:
				System.out.println("NOT HOSTED");
				break;
			}
		}
	}
}
