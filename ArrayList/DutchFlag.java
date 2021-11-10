package ArrayList;

public class DutchFlag {
	//bring 0 to front, 1 to middle and 2 to end in the same array
	public static void main(String[] args) {
		int[] arr = {1,2,0,1,2,0,0,2,1};
		int start=0, middle=0, end=arr.length-1;
		while(middle<=end) {
			switch(arr[middle]) {
				case 0:{
					int temp = arr[middle];
					arr[middle]=arr[start];
					arr[start]=temp;
					start++;
					break;
				}
				case 1:{
					middle++;
					break;
				}
				case 2:{
					int temp = arr[end];
					arr[end]= arr[middle];
					arr[middle]=temp;
					end--;
					break;
				}
			}
		}

		for(int i: arr) System.out.print(i+" ");
	}
}
