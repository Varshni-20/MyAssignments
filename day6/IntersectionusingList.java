package day6;

import java.util.ArrayList;
import java.util.List;

public class IntersectionusingList {

	public static void main(String[] args) {

		int[] array1 = { 3, 2, 11, 4, 6, 7 };
		int[] array2 = { 1, 2, 8, 4, 9, 7 };

		List<Integer> list1 = new ArrayList<>();
		for (int num : array1) {
			list1.add(num);
		}

		List<Integer> list2 = new ArrayList<>();
		for (int num : array2) {
			list2.add(num);
		}

		List<Integer> intersection = new ArrayList<>(list1);
		intersection.retainAll(list2);

		System.out.println("Common values in 2 arrays are : " + intersection);
	}
}
