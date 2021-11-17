package Recursion;
import Sorting.MergeSort;
import Sorting.QuickSort;

public class CallMergeAndQuickSortAlgoFromDiffPackage {
	public static void main(String[] args) {
		int[] arr = {2,6,7,2,3,1,0,0,2,4,6,26,0,58,6,9,4,3,3};
		new QuickSort(arr);
		for(int x: arr) System.out.print(x+" ");
		System.out.println();
		
		int[] arr1 = {10,6,6,2,0,4,3,82,1561,50,156,3,561,56,5,15,315,1,530,531,5,53,1};
		MergeSort.sort(arr1);
		for(int x: arr1) System.out.print(x+" ");
	}
}