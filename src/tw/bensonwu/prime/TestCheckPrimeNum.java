package tw.bensonwu.prime;
import java.io.Console;
public class TestCheckPrimeNum {

	public static void main(String[] args) {
//		Console console = System.console();
//		String yourNum = console.readLine("Please input a number:");
//		int i = Integer.parseInt(yourNum);
		int i = 67;
		double check = Math.sqrt(i);
		
		for(int k=1;k<=check;k++) {
			if((i%k==0 && k!=1)||i==1) {
				System.out.println("Not a prime number!");
				break;
			}
		}
		
	}

}
