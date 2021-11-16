package Sorting;

public class MergeSort {
	
	//MergeSort.sort(array);
	//to call the method form other classes
	
	//constructor to take input and call sort method from other class
	public MergeSort(int[] arr) {
		MergeSort.sort(arr);
	}
	public static void sort(int[] arr) {
		sorter(arr, 0, arr.length-1);
	}
	private static void sorter(int[] arr, int start, int end) {
		if(start<end) {
			int mid = start + (end-start)/2;
			
			//left side
			sorter(arr, start, mid);
			
			//right side
			sorter(arr, mid+1, end);
			
			//to merge
			merge(arr, start, mid  ,end);
		}
	}
	private static void merge(int[] arr, int start, int mid, int end) {
		
		int n1 = mid-start+1;
		int n2 = end-mid;
		
		int[] L = new int[n1];
		int[] R = new int[n2];
		
		int k = start;
		for(int i=0; i<n1; i++) L[i]=arr[k++];
		for(int i=0; i<n2; i++) R[i]=arr[k++];
		
		int x=start;
		int i=0;
		int j=0;
		while(i<n1 && j<n2) {
			if(L[i]<R[j]) {
				arr[x++]=L[i];
				i++;
			}
			else {
				arr[x++]=R[j];
				j++;
			}
		}
		while(i<n1) {
			arr[x++]=L[i];
			i++;
		}
		while(j<n2) {
			arr[x++]=R[j];
			j++;
		}
	}

}
