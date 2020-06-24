import java.util.Scanner;

class DecrementORIncrement {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if (number % 4 == 0) {
			number++;
		} else {
			number--;
		}
		System.out.println(number);
	}
}
