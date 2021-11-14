package BinarySearch;

public class FindTheMissingTermInASequence {
//time complexity log n
	//assuming that the missing element is not first/last element
	public static void main(String[] args) {
		int[] arr = {0,1,2,3,5,6,7,8,9};
		int order = 0;
		int diff1 = arr[1]-arr[0];
		int diff2 = arr[2]-arr[1];
		int diff3 = arr[3]-arr[2];
		if(diff1==diff2 && diff2==diff3) order = diff1;
		else if(diff1==diff2) order = diff1;
		else if(diff2==diff3) order = diff2;
		else if(diff3 == diff1) order = diff3;
		System.out.println(find(arr,order));
	}
	private static int find(int[] arr, int order) {
		int low = 0, high = arr.length-1;
		while(low<=high) {
			if((arr[low+1]-arr[low]==order) &&(arr[high]-arr[high-1]==order)) {
				low++;
				high--;
			}
			else if(arr[low+1]-arr[low]!=order) return arr[low]+order;
			else if(arr[high]-arr[high-1]!=order) return arr[high]-order;
		}
		return order;
	}
}
