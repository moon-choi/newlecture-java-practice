package ex19.array;

public class Array5 {

	public static void main(String[] args) {
		int[] nums = {2,3,6,4,1,5};
		
		int temp;
		
		temp = nums[1];
		nums[1] = nums[3];
		nums[3] = temp;
		
		System.out.println(nums[1]);
		System.out.println(nums[3]);

	}

}
