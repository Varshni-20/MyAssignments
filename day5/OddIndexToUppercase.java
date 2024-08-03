package day5;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		String test = "changeme";
		String result = changeOddIndexToUppercase(test);
		System.out.println(result);
	}

	public static String changeOddIndexToUppercase(String input) {
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (i % 2 != 0) {
				result.append(Character.toUpperCase(c));
			} else {
				result.append(c);
			}
		}
		return result.toString();
	}
}
