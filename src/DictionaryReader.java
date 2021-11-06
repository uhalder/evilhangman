import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class DictionaryReader {

	private static String filePath = "/Users/uhalder/eclipse-workspace/EvilHangman/src/dictionary.txt";

	// Key = Length of word
	// Value = List of words with the corresponding length
	static HashMap<Integer, List<String>> hashMap = new HashMap<Integer, List<String>>();
	private static int maxWordLength = Integer.MIN_VALUE;
	private static int minWordLength = Integer.MAX_VALUE;

	public static void readDictionary() {
		try {
			// opens the file
			File dictionaryFile = new File(filePath);
			Scanner fileReader = new Scanner(dictionaryFile);
			// reads file line by line till it ends
			while (fileReader.hasNextLine()) {
				String data = fileReader.nextLine();
				addToMap(data);
				System.out.println(data);
			}
			// closes file
			fileReader.close();

		} catch (Exception ex) {
			System.out.println("Exception: " + ex.getMessage());

		}

	}

	private static void addToMap(String word) {

		Integer lengthOfWord = word.length();
		// if the map does not contain the key then
		// 1. create a new list
		// 2. add the word to the list
		if (!hashMap.containsKey(lengthOfWord))
			hashMap.put(lengthOfWord, new ArrayList<String>());

		hashMap.get(lengthOfWord).add(word);
		updateMaxMinLength(lengthOfWord);

	}

	// finds the maximum word length in the dictionary and the minimum word length
	private static void updateMaxMinLength(Integer lengthOfWord) {
		maxWordLength = Math.max(lengthOfWord, maxWordLength);
		minWordLength = Math.min(lengthOfWord, minWordLength);

	}

}
