package BinarySearch;

public class PivotElement {
	public static void main(String[] args) {
		//find the no. of times of rotation for a given circular sorted array
		int[] arr = {3,15,16,18,19,20,21,22,23,24,25,26,27,28,29,60,1,2};
		System.out.println(pivotFinder(arr));
	}
	private static int pivotFinder(int[] arr) {
		
		int low=0, high = arr.length-1;
		if(arr[low]<arr[high]) return 0;
		
			while(low<=high) {
				int mid = low + (high-low)/2;
				//to identify the pivot point
				if(arr[mid]>arr[mid+1]) return mid+1;
				else if(arr[mid-1]>arr[mid]) return mid;
				
				// to update the low or high
				else if(arr[mid]>arr[low]) low = mid+1;
				else if(arr[mid]<arr[high]) high= mid-1;
			}
			
		return -1;
	}
}
