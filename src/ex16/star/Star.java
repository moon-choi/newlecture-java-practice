package ex16.star;

public class Star {

	public static void main(String[] args) {
		System.out.printf("%c", '☆');
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.printf("%c", '☆');
			}
			System.out.println();
		}
	}
}
