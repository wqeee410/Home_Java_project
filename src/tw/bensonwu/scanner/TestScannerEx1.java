package tw.bensonwu.scanner;

import java.util.Scanner;

public class TestScannerEx1 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		for (;;) {
			Scanner sc = new Scanner(System.in);
			String c = sc.next();
			System.out.println(c.substring(0,2));
			sc.close();
			break;

		}
	}

}
