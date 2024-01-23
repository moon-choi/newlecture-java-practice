package ex19.array;

public class Array4 { //배열 항목 찾기 

	public static void main(String[] args) {
		int[] nums = {5,2,7,4,6,1,3};
		
		int index = -1; 
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 1) {
				index = i;
				System.out.println(i);
				break;
			}

		}

	}

}
