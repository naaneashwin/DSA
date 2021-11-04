package BinarySearch;

public class UpperBoundBinarySearch {
	public static void main(String[] args) {
		//normal BS won't withstand repeating of the elements, hence lower/upper bound is used;
		int[] arr = {1,2,2,2,3,3,4,5,6,6,7,9,9,11,11,11,11,12,12,13,14};
		int target = 7;
		int s = upper_bound_BS(arr,target);
		if(s==-1)System.out.println("Target not found");
		else System.out.println(s);
	}
	public static int upper_bound_BS(int[]arr, int target) {
		
		int low =0, high = arr.length-1;
		
		while(low<=high) {
			int mid = low + (high-low)/2;
			if(target>=arr[mid]) low  = mid+1;
			else high = mid-1;
			
		}
		if(high==-1 || arr[high]!=target) return -1;
		return high;
		
	}
}
