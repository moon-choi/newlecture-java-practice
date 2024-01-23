package ex19.array;

public class Array {

	public static void main(String[] args) {
		//배열 초기화하는 방법.
		int[] arr = new int[7];
		
		int[] arr_ = new int[] {1,2,3,4,5,6,7};
		
		int[] arr__ = {1,2,3,4,5,6,7};
		
		//다차원 배열
		int[][] lottos = new int[3][6]; //참조형임. 이름표만 만드는 것. 
		int[][] lottos_ = new int[3][]; //위와 같은 표현임.
		
		//그래서 아래 코드는 에러는 나지 않지만 int[][] lottos = new int[3][6]와 같이 쓰면 잘못됀 코드. 
		//int[][] lottos_ = new int[3][]로 선언하고 다음 코드를 써야 맞음. 
		lottos[0] = new int[6];
		lottos[1] = new int[3];
		lottos[2] = new int[5];
	}

}
