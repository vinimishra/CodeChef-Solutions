import java.util.Scanner;

class IdAndShip {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		while (testCase-- != 0) {
			char c = scanner.next().charAt(0);
			if (c == 'B' || c == 'b') {
				System.out.println("BattleShip");
			} else if (c == 'C' || c == 'c') {
				System.out.println("Cruiser");
			} else if (c == 'D' || c == 'd') {
				System.out.println("Destroyer");
			} else {
				System.out.println("Frigate");
			}
		}
	}
}