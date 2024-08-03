package day5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String input = "hi hi Nila";
		String result = removeDuplicateWords(input);
		System.out.println(result);
	}

	public static String removeDuplicateWords(String input) {
		String[] words = input.split("\\s+");
		Set<String> seenWords = new HashSet<>();
		List<String> uniqueWords = new ArrayList<>();

		for (String word : words) {
			if (seenWords.add(word)) {
				uniqueWords.add(word);
			}
		}

		return String.join(" ", uniqueWords);
	}

}
