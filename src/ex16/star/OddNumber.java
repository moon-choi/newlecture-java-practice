package ex16.star;

public class OddNumber {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			
			if (i % 2 == 0) {
				System.out.printf("%c", "");
			}
			
			if(i == 4) {
				System.out.printf("%c", 'A' + i);
			} else {

				System.out.printf("%c,", 'A' + i);
			}
			
		}

	}

}
