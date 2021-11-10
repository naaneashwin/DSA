package Sorting;

public class SelectionSort {
	public static void main(String[] args) {
		
	}
	public static int[] sort(int[] arr) {
		
		for(int i=0; i<arr.length-1; i++) {
			int mid_ind = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]<arr[mid_ind]) mid_ind = j;
			}
			int temp = arr[i];
			arr[i]=arr[mid_ind];
			arr[mid_ind]=temp;
		}
		
		return arr;
	}
	public static char[] sort(char[] arr) {
		
		for(int i=0; i<arr.length-1; i++) {
			int mid_ind = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]<arr[mid_ind]) mid_ind = j;
			}
			char temp = arr[i];
			arr[i]=arr[mid_ind];
			arr[mid_ind]=temp;
		}
		
		return arr;
	}
}
