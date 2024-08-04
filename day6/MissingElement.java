package day6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MissingElement {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 10, 6, 8 };

		int min = array[0];
		int max = array[0];
		for (int num : array) {
			if (num < min)
				min = num;
			if (num > max)
				max = num;
		}

		Set<Integer> set = new HashSet<>();
		for (int num : array) {
			set.add(num);
		}

		List<Integer> missedvalues = new ArrayList<>();
		for (int i = min; i <= max; i++) {
			if (!set.contains(i)) {
				missedvalues.add(i);
			}
		}

		System.out.println("Missing numbers are : " + missedvalues);
	}
}
