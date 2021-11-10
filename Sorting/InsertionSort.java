package Sorting;

public class InsertionSort {
	public static void main(String...args) {
	}
	public static int[] sort(int[]arr) {
		for(int i=1; i<arr.length; i++) {
			int j=i-1;
			int key = arr[i];
			
			while(j>-1 && arr[j]>key) {
				arr[j+1]=arr[j];
				j = j-1;
			}
			arr[j+1]=key;
		}
		
		return arr;
	}
	public static char[] sort(char[]arr) {
		for(int i=1; i<arr.length; i++) {
			int j=i-1;
			char key = arr[i];
			
			while(j>-1 && arr[j]>key) {
				arr[j+1]=arr[j];
				j = j-1;
			}
			arr[j+1]=key;
		}
		
		return arr;
	}
}
