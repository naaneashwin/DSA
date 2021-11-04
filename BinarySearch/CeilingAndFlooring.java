package BinarySearch;

public class CeilingAndFlooring {
	public static void main(String[] args) {
		int[] arr = {2,3,5,6,9,11,13,15};
		int target = 11;
		int ceilResult = ceiling(arr, target);
		if(ceilResult >=0) {
			System.out.println(arr[ceilResult]);
		}
		else System.out.println("No ceil value found");
		int floorResult = flooring(arr, target);
		if(floorResult <arr.length) {
			System.out.println(arr[floorResult]);
		}
		else System.out.println("No floor value found");
	}
	private static int ceiling(int[] arr, int target) {
		int low = 0, high = arr.length-1;
		while(low<=high) {
			int mid = low + (high-low)/2;
			if(arr[mid]==target) return mid;
			else if(target<arr[mid]) high = mid-1;
			else low = mid+1;
		}
		
		return high;
	}
	private static int flooring(int[] arr, int target) {
		int low = 0, high = arr.length-1;
		while(low<=high) {
			int mid = low + (high-low)/2;
			if(arr[mid]==target) return mid;
			else if(target<arr[mid]) high = mid-1;
			else low = mid+1;
		}
			
			return low;
	}
}
