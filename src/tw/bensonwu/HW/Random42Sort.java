package tw.bensonwu.HW;

public class Random42Sort {

	public static void main(String[] args) {
		int[][] data = new int[2][42];
		for (int index = 0; index < data[0].length; index++) {
			data[0][index] = index + 1;
//			System.out.println(data[0][index]);
		}
		for (int i = 1; i <= 100000; i++) {
			int RandomNum = (int) (Math.random() * 42 + 1);
//			System.out.println(RandomNum);
			for (int j = 0; j < data[1].length; j++) {
				if (RandomNum == j + 1) {
					data[1][j]++;
				}
			}
		}
		System.out.println("Q1.\nNumber\tTimes");
		for (int a = 0; a <= data[1].length - 1; a++) {
			System.out.printf(" %2d\t%4d", data[0][a], data[1][a]);
			System.out.println();
		}
		System.out.println("\n");
		while (true) {
			int count = 0;
			for (int Compare = 0; Compare < data[1].length - 1; Compare++) {
				int blank_Times = 0;
				int blank_Index = 0;
				if (data[1][Compare] < data[1][Compare + 1]) {
					blank_Times = data[1][Compare];
					blank_Index = data[0][Compare];
					data[1][Compare] = data[1][Compare + 1];
					data[0][Compare] = data[0][Compare + 1];
					data[1][Compare + 1] = blank_Times;
					data[0][Compare + 1] = blank_Index;
					count++;
				}
			}
			if (count == 0) {
				break;
			}
		}
		System.out.println("Q2.\nNumber\tTimes");
		for (int b = 0; b < data[1].length; b++) {
			System.out.printf("  %2d\t%4d", data[0][b], data[1][b]);
			System.out.println();
		}

	}

}
