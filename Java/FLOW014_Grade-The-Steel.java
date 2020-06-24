import java.util.Scanner;

class GradeTheSteel {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		while (testCase-- != 0) {
			int hardness = scanner.nextInt();
			float carbonContent = scanner.nextFloat();
			int tensileStrength = scanner.nextInt();

			boolean hardnessGreater = (hardness > 50);
			boolean carbonContentSmaller = (carbonContent < 0.7);
			boolean tensileStrengthGreater = (tensileStrength > 5600);

			if (hardnessGreater && carbonContentSmaller && tensileStrengthGreater) {
				System.out.println("10");
			} else if (hardnessGreater && carbonContentSmaller) {
				System.out.println("9");
			} else if (carbonContentSmaller && tensileStrengthGreater) {
				System.out.println("8");
			} else if (hardnessGreater && tensileStrengthGreater) {
				System.out.println("7");
			} else if (hardnessGreater || carbonContentSmaller || tensileStrengthGreater) {
				System.out.println("6");
			} else {
				System.out.println("5");
			}
		}
	}

}
