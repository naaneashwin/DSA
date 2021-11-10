package ArrayList;

public class MoveZeroesToFront {
	public static void main(String[] args) {
		int[] arr = {0,1,1,0,1,0,0,1,0,0,0,0,1}; 	
		//two pointer, sort, count and create new array
		int i=0, j=arr.length-1;
		while(i<=j) {
			if(arr[i]==1) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j--;
			}
			else i++;
		}
		for(int i1: arr) System.out.print(i1 + " ");
	}
}
