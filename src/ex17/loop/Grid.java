package ex17.loop;

public class Grid {

	public static void main(String[] args) {
		//방법 1. x축 y축 할
		for(int y = 0; y < 3; y++) {
			for(int x = 1; x < 4; x++) {
				System.out.printf("%d", y * 3 + x);
			}
			System.out.println();
		}
		
		System.out.printf("%n");
		
		//방법 2. 3의 배수로 
		for(int i = 0; i < 9; i++) {
			System.out.printf("%d", i + 1);
			if(i%3 == 2) {
				System.out.println();
			}
		}

	}

}
