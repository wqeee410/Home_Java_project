package tw.bensonwu.HW;

import java.io.Console;
import java.util.Random;

public class guessNumBomb {

	public static void main(String[] args) {
		Random random = new Random();
		Console console = System.console();
		String difficultyStr = console.readLine("請輸入難度(1~9):");
		int difficulty = Integer.parseInt(difficultyStr);
		int bombNum = random.nextInt((int) Math.pow(10, difficulty))+1;
		int temporaryB=1,temporaryC=(int)(Math.pow(10, difficulty));

//		System.out.println(bombNum);
		
		
		while(true) {
			String yourNum = console.readLine("請輸入數字:");
			if(!(guessNumXAXB.isNumeric(yourNum))){
				System.out.println("請輸入數字:");
				continue;
			}
			int guess = Integer.parseInt(yourNum);
			System.out.println();
			if(guess<temporaryB ||guess>temporaryC) {
				System.out.println("錯誤! 請輸入"+temporaryB+"~"+temporaryC+"的數字");
				continue;
			}
			
			if (guess==bombNum) {
				System.out.println("BOOOOOOOOOOO! You Lose!");
				break;
			}
			else if (guess<bombNum) {
				temporaryB = guess+1;
				System.out.println("BOMB is between "+ temporaryB +"~"+ temporaryC);
			}
			else {
				temporaryC = guess-1;
				System.out.println("BOMB is between "+ temporaryB +"~"+ temporaryC);
			}
		}
	}

}
