package Sorting;
import Sorting.BubbleSort;

public class MajorityElement {
	public static void main(String[] args) {
		
		//if the majority element is more than array.length/2;
		int[] arr = {1,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,2,3,8,9,5,2,3,8,6,9,1,2};
		BubbleSort.sort(arr);
		System.out.println(arr[arr.length/2]);
		for(int num : arr){
			System.out.println(num);
		}
	}
}
