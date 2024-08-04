package day6;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int[] array = { 3, 2, 11, 4, 6, 7 };

		Integer largest = null;
		Integer secondLargest = null;

		for (int i = 0; i < array.length; i++) {
			int number = array[i];

			if (largest == null || number > largest) {
				secondLargest = largest;
				largest = number;
			} else if (number != largest && (secondLargest == null || number > secondLargest)) {
				secondLargest = number;
			}
		}

		if (secondLargest == null) {
			System.out.println("There is no second largest element because all elements are the same.");
		} else {
			System.out.println("The second largest number is: " + secondLargest);
		}
	}
}
