package BinarySearch;

public class FrequencyOfANumberInSortedArray {
	public static void main(String[] args) {
		int[] nums = {1,1,2,2,4,5,5,6,6,6,6,9,10,11};
		int target = 0;
		int up = upperBound(nums,target);
		int low = lowerBound(nums,target);
		if(up>-1 && low>-1) {
			int frequency =  up - low +1;
			System.out.println("The frequency is "+frequency);
		}
		else System.out.println("The number is not found");
		
	}
	private static int lowerBound(int[] nums, int target) {
		int low = 0,high = nums.length-1;
		while(low<high) {
			int mid = low + (high-low)/2;
			if(target <= nums[mid]) high = mid;
			else low = mid+1;
		}
		if(nums[low]==target) return low;
		return -1;
	}
	private static int upperBound(int[] nums, int target) {
		int low =0, high = nums.length-1;
		while(low<=high) {
			int mid = low + (high-low)/2;
			if(target>=nums[mid]) low = mid+1;
			else high = mid-1;
		}
		if(high==-1 || nums[high]!=target) return -1;
		
		return high;
	}
}
