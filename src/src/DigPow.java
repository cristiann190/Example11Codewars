package src;

import java.util.ArrayList;

public class DigPow {
	public static long digPow(int number, int power) {
		int sum = 0;
		for (Integer digit : getDigits(number)) {
			sum += Math.pow(digit, power);
			power++;
		}
		if (sum % number == 0) {
			return sum / number;
		} else {
			return -1;
		}
	}

	private static ArrayList<Integer> getDigits(int number) {
		ArrayList<Integer> digits = new ArrayList<>();
		while (number > 0) {
			digits.add(0, number % 10);
			number = number / 10;
		}
		return digits;
	}


	//    ----------------OPTIMIZED-----------------

	public static long digPowOptimized(int n, int p) {
		String intString = String.valueOf(n);
		long sum = 0;
		for (int i = 0; i < intString.length(); ++i, ++p)
			sum += Math.pow(Character.getNumericValue(intString.charAt(i)), p);
		return (sum % n == 0) ? sum / n : -1;
	}
}