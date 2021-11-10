package ArrayList;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class FindUniqueElementsOfTwoArrays {
	public static void main(String[] args) {
		int[] arr1 = {2,5,9,3,4,6,3};
		int[] arr2 = {0,6,9,7,3,6,8};//9,3,6
		Arrays.sort(arr2);
		List<Integer> arrList = new ArrayList<>();
		for(int i=0; i<arr1.length; i++) {
			if(search(arr2, arr1[i])) {
				if(!arrList.contains(arr1[i])) arrList.add(arr1[i]);
			}
		}
		for(int a : arrList) System.out.println(a);
	}
	private static boolean search(int[] arr, int target) {
		
		int low = 0, high = arr.length;
		while(low<=high) {
			int mid = low + (high-low)/2;
			if(arr[mid]==target) return true;
			else if(arr[mid]>target) high = mid-1;
			else low = mid+1;
		}
		
		return false;
	}
}
