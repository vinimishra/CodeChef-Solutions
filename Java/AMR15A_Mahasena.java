import java.util.Scanner;

class Mahasena {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfSoldier = scanner.nextInt();
		int soldierInMahasena[] = new int[numberOfSoldier];
		int evenWeapons = 0;
		for (int i = 0; i < numberOfSoldier; i++) {
			soldierInMahasena[i] = scanner.nextInt();
			if (soldierInMahasena[i] % 2 == 0) {
				evenWeapons++;
			}
		}
		if (evenWeapons > (numberOfSoldier / 2)) {
			System.out.println("READY FOR BATTLE");
		} else {
			System.out.println("NOT READY");
		}
	}
}
