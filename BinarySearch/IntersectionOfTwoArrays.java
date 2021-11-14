package BinarySearch;
import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoArrays {
	//find the common elements of two arrays and if an element appears don't repeat the element in result
	public static void main(String[] args) {
		int[] arr1 = {-1,0,4,2,3,1,4,5,1};
		int[] arr2 = {-1,2,85,6,4,9,4};
		List<Integer> map = new ArrayList<>();
		sort(arr1);
		
		for(int i=0; i<arr2.length; i++) {
			if(map.contains(arr2[i])) continue;
			else if(check(arr1, arr2[i])) {
				map.add(arr2[i]);
			}
		}
		System.out.println(map);
	}
	private static int[] sort(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			int key = arr[i];
			int j = i-1;
			while(j>-1 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		return arr;
	}
	private static boolean check(int[] arr, int target) {
		int low = 0, high = arr.length-1;
		while(low<=high) {
			int mid = low +(high-low)/2;
			if(arr[mid]==target) return true;
			else if(target<arr[mid]) high = mid-1;
			else low = mid+1;
		}
		return false;
	}
}

