package day5;

import java.util.ArrayList;
import java.util.List;

public class ReverseOddPositions {
	public static void main(String args[]) {
		String test = "I am a software tester";
        String result = reverseOddPositionWords(test);
        System.out.println(result);
    }

    public static String reverseOddPositionWords(String input) {
        String[] words = input.split("\\s+");
        List<String> resultWords = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (i % 2 == 1) { 
                resultWords.add(new StringBuilder(words[i]).reverse().toString());
            } else {
                resultWords.add(words[i]);
            }
        }

        return String.join(" ", resultWords);

	}

}
