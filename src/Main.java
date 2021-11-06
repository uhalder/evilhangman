import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// Step 1
		DictionaryReader.readDictionary();
		// Step 2
		Scanner scan = new Scanner(System.in);
		int wordLength = ValidWordLength.promptLength(scan);
		// Step3
		int numberOfGuesses = Guesses.promptGuess(scan);
		// Step4
		boolean wd = NumOfWdsR.promptAnswer(scan);
		scan.close();
		// Step5
	}

}
