package BinarySearch;

public class TwoSumOfArray {
//find the 2 elements in the given array such that the sum of two distinct elements is equal to the target
//Input array is sorted in increasing order	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int target = 9;
		int[] indexOfElements = new int[2];
		int f =0, b = arr.length-1;
		while(arr[f]<arr[b]) {
			if(arr[f]+arr[b]==target) {
				indexOfElements[0]=f;
				indexOfElements[1]=b;
				break;
			}
			else if(arr[f]+arr[b]>target) b--;
			else f++;
		}
		System.out.println(arr[f] + " " + arr[b]);
	}
}
