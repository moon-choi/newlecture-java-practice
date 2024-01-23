package ex18.omok;

public class Connect {

	public static void main(String[] args) {
		for(int y = 1; y <= 10; y++) {
			for(int x = 1; x <= 10; x++) {
				if(x == 4 && y == 3)
					System.out.printf("%c", '●'); 
				
				//꼭짓점은 변보다 더 특수한 케이스니까 더 위로가야함. 
				else if( x == 1 && y == 1)
					System.out.printf("%c", '┌'); 
				else if( x == 10 && y == 1)
					System.out.printf("%c", '┐'); 				
				else if( x == 1 && y == 10)
						System.out.printf("%c", '└'); 				
				else if( x == 10 && y == 10)
					System.out.printf("%c", '┘'); 
				
				
				else if (y == 1)
					System.out.printf("%c", '┬'); 
				else if ( y == 10)
					System.out.printf("%c", '┴');	
				else if (x == 1)
					System.out.printf("%c", '├');
				else if (x == 10)
					System.out.printf("%c", '┤');			
				else				
					System.out.printf("%c", '┼');
		
			}
			System.out.println();
			
		}

	}

}

/*
┌┬┬┬┬┬┬┬┬┐
├┼┼┼┼┼┼┼┼┤
├┼┼●┼┼┼┼┼┤
├┼┼┼┼┼┼┼┼┤
├┼┼┼┼┼┼┼┼┤
├┼┼┼┼┼┼┼┼┤
├┼┼┼┼┼┼┼┼┤
├┼┼┼┼┼┼┼┼┤
├┼┼┼┼┼┼┼┼┤
└┴┴┴┴┴┴┴┴┘
*/