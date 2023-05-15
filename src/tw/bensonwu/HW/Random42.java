package tw.bensonwu.HW;

public class Random42 {

	public static void main(String[] args) {
		int [] data = new int[42];
		for (int k = 1; k <= 100000; k++) {
			int RandomNum = (int) (Math.random() * 42 + 1);
				for(int index=0;index<=data.length-1;index++) {
					if(RandomNum==index+1) {
						data[index]++;
					}
				}
		}
		System.out.println("Number\tTimes");
		for(int i=0;i<=data.length-1;i++) {
			System.out.printf(" %2d\t%4d",i+1,data[i]);
			System.out.println();
		}

	}

}
