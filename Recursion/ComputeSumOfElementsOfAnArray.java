package Recursion;

public class ComputeSumOfElementsOfAnArray {
	
	public static void main(String[] args) {
		int sum =0;
		int[] arr = {1,2,3,4,5,6};
		add(arr, arr.length, 0, sum);
		int[] arr1 = {20,3,20,202,50};
		add(arr1, arr1.length, 0, sum);
	}
	static void add(int[] arr, int length, int index, int sum) {
		if(index==length) {
			 System.out.println(sum);
			 return;
		}
		sum += arr[index];

		add(arr, arr.length, ++index, sum);
	}
}
