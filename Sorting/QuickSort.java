package Sorting;

public class QuickSort {
	public static void main(String[] args) {
		int[] arr = {5,1,3,2,6,4,8,9,7};
		sort(arr, 0, arr.length-1);
		for(int x: arr) System.out.print(x +" ");
	}
	private static void sort(int arr[], int start, int end) {
		if(start<end) {
			int pivot = partition(arr,start, end);
			sort(arr, start, pivot-1);
			sort(arr, pivot+1, end);
		}
	}
	private static int partition(int arr[], int left, int right) {
		int pivot = left;
		while(arr[pivot]<arr[right]) {
			right--;
		}
		int tempR = arr[pivot];
		arr[pivot]=arr[right];
		arr[right]=tempR;
		
		pivot = right;
		while(arr[pivot]>arr[left]) {
			left++;
		}
		int tempL = arr[pivot];
		arr[pivot]=arr[left];
		arr[left]=tempL;
		
		pivot = left;
		
		return pivot;
	}
	
}

