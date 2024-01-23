package ex19.array;

import java.util.Random;

public class Array6 { //배열 항목 찾기 

	public static void main(String[] args) {

		Random rand = new Random();
		int[] lotto = new int[6];
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = rand.nextInt(45) + 1; //nextInt(int bound) bound는 범위.
			System.out.printf("%d ", lotto[i]);

		}

	}

}