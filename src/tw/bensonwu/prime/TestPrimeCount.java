package tw.bensonwu.prime;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class TestPrimeCount {

	public static void main(String[] args) {
		Console console = System.console();
		String yourNum = console.readLine("Please input a number:");
		int i = Integer.parseInt(yourNum);
//		int i = 101;
		int count = 0;
		List<Integer> blank = new ArrayList<>();
		for (int j = 1; j <= i; j++) {
			if (testPrime(j)) {
				count++;
				blank.add(j);
			}
		}

		System.out.println("Prime count:" + count);
		System.out.println("Prime digit is:" + blank);

	}

	// 判斷是否質數
	public static boolean testPrime(int testNum) {
		double check = Math.sqrt(testNum);
		for (int k = 1; k <= check; k++) {
			if ((testNum % k == 0 && k != 1) || testNum == 1) {
				return false;
			}
		}
		return true;
	}
}
