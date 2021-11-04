package BinarySearch;

public class FirstAndFinalOccuranceOfANumberInASortedArray {
	public static void main(String[] args) {
		int[] arr = {1,3,3,3,3,3,6,6,6,6,7,7,7,7};
		int target = 3;
		System.out.println("The first appearance is at index " + firstAppearance(arr, target));
		System.out.println("The last appearance is at index " + lastAppearance(arr, target));
	}
	private static int firstAppearance(int[] nums, int target) {
		int low =0, high = nums.length-1;
		while(low<high) {
			int mid = low + (high-low)/2;
			if(nums[mid]>=target) high = mid;
			else low = mid+1;
		}
		if(nums[low]==target) return low;
		return -1;
	}
	private static int lastAppearance(int[] nums, int target) {
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
