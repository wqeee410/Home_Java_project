package tw.bensonwu.forloop;

public class TimeSquareEx1 {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
//			System.out.print(j + "x"+i + "="+j*i + "\t");	
				System.out.printf("%dx%d=%2d\t", j, i, j * i);
			}
			System.out.println();
//			System.out.print("\n");

		}
	}
}
