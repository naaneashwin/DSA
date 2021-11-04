package BinarySearch;

public class SimpleBinarySearch {
//Search using binary search(simple)
//array should be sorted
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,12,4565,18775};
		int target = 4565;
		int s = binary_search(arr,target);
		if(s==-1)System.out.println("Target not found");
		else System.out.println(s);
	}
	
	public static int binary_search(int[] arr, int target) {
		
		int low = 0, high = arr.length-1;
		
		while(low<=high){
			int mid = low + (high-low)/2; //to avoid overflow, otherwise you can use (high+low)/2
			if(arr[mid]==target) return mid;
			else if(target<arr[mid]) high = mid-1;
			else low = mid+1;
		}
		
		return -1;
	}
}
