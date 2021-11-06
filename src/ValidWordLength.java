import java.util.Scanner;

public class ValidWordLength {

	private static int wordLength;

	public static int promptLength(Scanner inputScanner) {

		// prompts user to continuing enter word length until they enter a valid word
		// length
		// (meaning that the key is available with the length)
		while (true) {
			System.out.print("Step 1: Enter word length: ");
			wordLength = inputScanner.nextInt();
			if (isValidLength(wordLength) == true) {
				System.out.println(" ==> You have entered valid word length: " + wordLength);
				break;
			} else {
				System.out.println("<Invalid word length, please try again>");
			}
		}
		return wordLength;
	}

	public static boolean isValidLength(int length) {
		// check valid length on in one way. Check if the key is available with the
		// length
		return DictionaryReader.hashMap.containsKey(length);

	}

}
