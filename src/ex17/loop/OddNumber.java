package ex17.loop;

public class OddNumber {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			if(i == 4) { 	//범위가 넓을수록 가장 맨위의 if 문에 배치하고 밑으로 갈수록 촘촘하게.
				System.out.printf("%c", 'A' + i); //예외항목은 if문 안에.
			} else {
				if (i % 2 != 0) {
					System.out.print(" ,");
				} else {
					System.out.printf("%c,", 'A' + i); //기본값은 else문 안에.
				}
				
			}
			
		} //A, ,C, ,E
		
		System.out.print("\n");
		
		for(int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				System.out.printf("%c,", ' ');
			} else if(i==4) {
				System.out.printf("%c,", 'A' + i); //기본값은 else문 안에.
			} else {
				System.out.printf("%c", 'A' + i); //예외항목은 if문 안에.
			}
						
		} // ,B ,D ,

	}

}
 