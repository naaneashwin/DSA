package BinarySearch;

public class LowerBoundBinarySearch {
	public static void main(String[] args) {
		//normal BS won't withstand repeating of the elements, hence lower/upper bound is used;
		int[] arr = {1,2,2,2,3,3,4,5,6,6,7,9,9,11,11,11,11,12,12,13,14};
		int target = 2;
		int s = lower_bound_BS(arr,target);
		if(s==-1)System.out.println("Target not found");
		else System.out.println(s);
	}
	public static int lower_bound_BS(int[]arr, int target) {
		
		int low =0, high = arr.length-1;
		
		while(low<high) {
			int mid = low + (high-low)/2;
			if(target<=arr[mid]) high = mid;
			else low = mid + 1;
			
		}
		//negative side check
		if(arr[low]!=target) return -1;
		
		return low;
		
	}
}
