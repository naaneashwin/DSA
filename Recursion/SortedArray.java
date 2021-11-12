package Recursion;

public class SortedArray {
	public static void main(String[] args) {
		int [] arr = {1,2,3,6,35};
		System.out.println(check(arr, 0));
	}
	private static boolean check(int[] arr, int idx) {
		if(idx==arr.length-1) return true;
		if(arr[idx+1]>arr[idx]) {
			return check(arr, ++idx);
		}
			
		return false;
	}
}
