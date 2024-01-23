package ex19.array;

public class Array2 { //배열 값 이동하기 

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7}; //배열은 확장할 수 없는 정적인 크기를 갖고 있음. 
		
		//동적으로 늘리려면 배열 값을 이주시켜야함. 
		//nums[7] = 8; //불가능.
		
		for(int i = 0; i < 7; i++) {
			System.out.printf("%d", nums[i]);
		}
		
		int[] temp = new int[10];
		
		for(int i = 0; i < 7; i++) {
			temp[i] = nums[i];
		}
		
		nums = temp; //nums 배열을 교체***
		nums[7] = 8;
		
		for(int i = 0; i < 8; i++) {
			System.out.printf("%d",  nums[i]);
		}
	}

}
