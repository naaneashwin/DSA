package Sorting;

public class ContainsDuplicate {
	public static void main(String[] args) {
		boolean flag = true;
		int[] nums = {1,2,3,1};
		BubbleSort.sort(nums);
		for(int i=0; i<nums.length-1; i++) {
			if((nums[i]^nums[i+1])==0)
			flag = false;
			break;
		}
		if(flag) System.out.println("No duplicates");
		else  System.out.println("Contains Duplicate");
	}
}
