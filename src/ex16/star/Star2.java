package ex16.star;

//public class Star2 {
//
//	public static void main(String[] args) {
//		
//		String row = "";
//		
//		for (int i = 0; i < 10; i++) {
//			row += '☆';
//			System.out.println(row);
//		}
//		
//	}
//}

public class Star2 {

	public static void main(String[] args) {
		System.out.printf("%c", '☆');
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < i; j++) {
				System.out.printf("%c", '☆');
			}
			System.out.println();
		}
	}
}
