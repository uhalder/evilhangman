import java.util.Scanner;

public class Guesses {

	private static int numberOfGuesses;

	public static int promptGuess(Scanner inputScanner) {

		// uses scanner and prompts user to continue making valid guesses until they do
		// so
		while (true) {
			System.out.print("Step 2: Enter number of guesses you want: ");

			numberOfGuesses = inputScanner.nextInt();

			if (isValidGuess(numberOfGuesses) == true) {
				System.out.println(" ==> You have entered valid number of guesses: " + numberOfGuesses);
				break;
			} else {
				System.out.println("<Invalid number of guesses, please try again>");
			}
		}
		return numberOfGuesses;
	}

	// i set the number of guesses to be between 0 and 26, so it checks whether the
	// guess the user enters is within
	// the range
	public static boolean isValidGuess(int numberOfGuesses) {
		if (numberOfGuesses > 0 && numberOfGuesses <= 26) {
			return true;
		} else {
			return false;
		}
	}

}
