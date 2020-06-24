import java.util.Scanner;

class HelpLostRobot {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		while (testCase-- != 0) {
			int x1 = scanner.nextInt();
			int y1 = scanner.nextInt();
			int x2 = scanner.nextInt();
			int y2 = scanner.nextInt();
			
			if (x1 == x2 && y1 != y2) {
				if (y1 > y2)
					System.out.println("down");
				else
					System.out.println("up");
			} else if (x1 != x2 && y1 == y2) {
				if (x1 > x2)
					System.out.println("left");
				else
					System.out.println("right");
			} else {
				System.out.println("sad");
			}
		}
	}
}
