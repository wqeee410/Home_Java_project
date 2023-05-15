package tw.bensonwu.HW;

import java.io.Console;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class guessNumXAXB {
	public static boolean isNumeric(String str) {
		for (int h = 0; h <= str.length() - 1; h++) {
			if (!(Character.isDigit(str.charAt(h)))) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		Console console = System.console();
		while (true) {
			String difficultyStr = console.readLine("請輸入難度(1-10):");
			if (!(isNumeric(difficultyStr))) {
				System.out.println("輸入錯誤! 請輸入數字 1-10");
				continue;
			}
			int difficulty = Integer.parseInt(difficultyStr);
			if (difficulty > 10 || difficulty < 1) {
				System.out.println("輸入錯誤! 請輸入難度(1-10)");
				continue;
			} else {
				List<Integer> guessNum = new ArrayList<>();
				int A = 0, B = 0;
				for (int i = 1;; i++) {
					int random = (int) (Math.random() * 10);
					if (!guessNum.contains(random)) {
						guessNum.add(random);
					}
					if (guessNum.size() == difficulty) {
						break;
					}

				}
//				guessNum.add(5);
//				guessNum.add(4);
//				guessNum.add(2);
//				guessNum.add(8);
				while (true) {
					String num = console.readLine("請輸入您的數字:");
					List<Integer> yourNum = new ArrayList<>();
					Set<Integer> check = new HashSet<>();

					if (!(num.length() == difficulty)) {
						System.out.println("請輸入" + difficulty + "位數字");
						continue;
					}
					for (int k = 0; k < difficulty; k++) {
						yourNum.add(Integer.parseInt(num.substring(k, k + 1)));
					}
					check = yourNum.stream().collect(Collectors.toSet());
					if (!(check.size() == difficulty)) {
						System.out.println("請輸入不同的數字");
						continue;
					}
					// System.out.println(guessNum);
					for (int x : yourNum) {
						System.out.print(x);
					}
					System.out.println();
//					System.out.println(guessNum);
					for (int a = 0; a <= (difficulty - 1); a++) {
						for (int b = 0; b <= (difficulty - 1); b++) {
							if (yourNum.get(b) == guessNum.get(a)) {
								B = B + 1;
							}
						}
						if (yourNum.get(a) == guessNum.get(a)) {
							A++;
							B--;
						}
					}
					if (A != difficulty) {
						System.out.println(A + "A" + B + "B");
						A = 0;
						B = 0;
					} else {
						System.out.println("You Win!");
						return;
					}
				}
			}
		}

	}

}
