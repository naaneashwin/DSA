package Sorting;

public class QuickSort {
	public QuickSort(int[] arr) {
		sort(arr);
	}
	private void sort(int[] arr) {
		quickSort(arr, 0, arr.length-1);
	}
	private static void quickSort(int arr[], int start, int end) {
		if(start<end) {
			int pivot = partitionLeft(arr,start, end);
			quickSort(arr, start, pivot-1);
			quickSort(arr, pivot+1, end);
		}
	}
	private static int partitionRight(int arr[], int left, int right) {
		int pivot = right;
		int i=left-1;
		for(int j=left; j<right; j++) {
			if(arr[j]<=arr[pivot]) {
				i++;
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1]=arr[right];
		arr[right]=temp;
		
		
		
		return i+1;
	}
	private static int partitionLeft(int arr[], int left, int right) {
		int pivot = left;
		int i=right+1;
		for(int j=right; j>left; j--) {
			if(arr[j]>=arr[pivot]) {
				i--;
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp = arr[i-1];
		arr[i-1]=arr[left];
		arr[left]=temp;
		
		
		
		return i-1;
	}
}

