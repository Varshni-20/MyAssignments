package day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortUsingCollection {

	public static void main(String[] args) {

		String[] array = { "HCL", "Wipro", "Aspire Systems", "CTS" };
		List<String> list = new ArrayList<>();
		Collections.addAll(list, array);
		Collections.reverse(list);
		System.out.println(String.join(", ", list));
	}
}
