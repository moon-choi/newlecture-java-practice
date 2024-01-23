package ex16.star;

public class Star3 {

	public static void main(String[] args) {
		System.out.printf("%c", '☆'); //출력값을 캐릭터로 봐줘.
		
		for(int i = 10; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.printf("%c", '☆');
			}
			System.out.println();
		}
	}
}
