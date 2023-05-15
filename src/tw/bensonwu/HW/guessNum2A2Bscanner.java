package tw.bensonwu.HW;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class guessNum2A2Bscanner {

	public static boolean isNumeric(String str) {
		for (int h = 0; h <= str.length() - 1; h++) {
			if (!(Character.isDigit(str.charAt(h)))) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		List<Integer> guessNum = new ArrayList<>();
		int A = 0, B = 0;
		for (int i = 1;; i++) {
			int random = (int) (Math.random() * 10);
			if (!guessNum.contains(random)) {
				guessNum.add(random);
			}
			if (guessNum.size() == 4) {
				break;
			}

		}
		while (true) {
			Scanner sc = new Scanner(System.in);
			String inputNum = sc.next();
			ArrayList<Integer> yourNum = new ArrayList<Integer>();
			Set<Integer> checkSet = new HashSet<Integer>();
			if (inputNum.length() != 4) {
				System.out.println("請輸入4位數字");
				continue;
			}
			if (!isNumeric(inputNum)) {
				System.out.println("請輸入數字");
				continue;
			} else {
				for (int x = 1; x <=4; x++) {					
					yourNum.add(Integer.parseInt(inputNum.substring(x-1, x)));
				}
				checkSet=yourNum.stream().collect(Collectors.toSet());
				if (checkSet.size()!=4) {
					System.out.println("請輸入不重複的數字");
					continue;
				}
				System.out.print("你的數字: ");
				for(int y:yourNum) {
					System.out.print(y);
				}
				
				System.out.println();
				for (int a = 0; a <= 3; a++) {
					for (int b = 0; b <= 3; b++) {
						if (yourNum.get(b) == guessNum.get(a)) {
							B = B + 1;
						}
					}
					if (yourNum.get(a) == guessNum.get(a)) {
						A++;
						B--;
					}
				}
				if (A != 4) {
					System.out.println(A + "A" + B + "B");
					A = 0;
					B = 0;
				} else {
					System.out.println("You Win!");
					sc.close();
					break;
				}
				
			}

		}
	}

}
