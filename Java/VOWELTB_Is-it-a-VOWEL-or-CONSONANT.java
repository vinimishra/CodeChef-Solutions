import java.util.Scanner;

class IsItaVOWELorCONSONANT {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char ch = scanner.next().charAt(0);
		switch (ch) {
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Consonant");
			break;
		}

	}

}
