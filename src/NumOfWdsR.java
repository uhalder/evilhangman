import java.util.Scanner;

public class NumOfWdsR {
	private static int wd;

	// if user wants to know the number of words remaining, enter 1 using scanner
	// else return any other number
	public static boolean promptAnswer(Scanner inputScanner) {
		System.out.print("Step 3: Do you want to know the number of words remaining(1 = yes, Others = no)?: ");
		wd = inputScanner.nextInt();

		if (wantRemainingWds(wd) == true) {
			System.out.print("You selected to know the number of words remaining");
			return true;
		} else {
			System.out.print("You did not select to know the number of words remaining");
			return false;
		}
	}

	// 1 => yes, any other number => no
	public static boolean wantRemainingWds(int word) {
		if (word == 1) {
			return true;
		} else {
			return false;
		}
	}

}
