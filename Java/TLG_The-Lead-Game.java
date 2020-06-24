import java.util.Scanner;

class TheLeadGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfRounds = scanner.nextInt();
		int teamOneScore[] = new int[numberOfRounds];
		int teamTwoScore[] = new int[numberOfRounds];
		int totalScoreOfTeamOne = 0, totalScoreOfTeamTwo = 0, lead = 0, player = 0;
		for (int i = 0; i < numberOfRounds; i++) {
			teamOneScore[i] = scanner.nextInt();
			teamTwoScore[i] = scanner.nextInt();

			totalScoreOfTeamOne += teamOneScore[i];
			totalScoreOfTeamTwo += teamTwoScore[i];

			if (totalScoreOfTeamOne - totalScoreOfTeamTwo > lead) {
				player = 1;
				lead = totalScoreOfTeamOne - totalScoreOfTeamTwo;
			} else if (totalScoreOfTeamTwo - totalScoreOfTeamOne > lead) {
				player = 2;
				lead = totalScoreOfTeamTwo - totalScoreOfTeamOne;
			}
		}
		System.out.println(player + " " + lead);
	}
}
