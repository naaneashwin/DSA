package Recursion;

public class FindMinumumInAnArray {
	//using recursion
	public static void main(String[] args) {
		int[] arr = {2,3,5,9,4,3,1,0,10};
		int min = Integer.MAX_VALUE;
		System.out.println(findMin(arr,min,0));
	}
	private static int findMin(int[] arr, int min, int idx) {
		if(idx==arr.length) return min;
		if(arr[idx]<min) {
			min = arr[idx];
		}
		return findMin(arr,min,++idx);
	}
}
