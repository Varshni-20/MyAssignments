package day5;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";

		if (Anagrams(text1, text2)) {
			System.out.println("The strings are anagrams.");
		} else {
			System.out.println("The strings are not anagrams.");
		}
	}

	public static boolean Anagrams(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}

		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		return Arrays.equals(arr1, arr2);
	}

}
