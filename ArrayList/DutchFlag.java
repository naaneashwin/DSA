package ArrayList;

public class DutchFlag {
	//bring 0 to front, 1 to middle and 2 to end in the same array
	public static void main(String[] args) {
		int[] arr = {2,0,1,2,0,0,2,2};
		int start=0, middle=0, end=arr.length-1;
		while(middle<=end) {
			switch(arr[middle]) {
				case 0:{
					int temp = arr[middle];
					arr[middle]=arr[start];
					arr[start]=temp;
					start++;
					middle++;
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
		System.out.println();
		int[] a = {0,2,2,1,1,0,0,2,1};
		int[] b = new int[a.length];
		b=dutch(a,a.length);
		for(int i: b) System.out.print(i+" ");
	}
	private static int[] dutch(int[] arr, int n) {
		int low = 0;
		int high = n-1;
		int mid = 0 ,temp;
			while(mid<=high) {
				if(arr[mid] == 0) {
					temp = arr[low];
					arr[low] = arr[mid];
					arr[mid] = temp;
					low++;
					mid++;
				}
				else if(arr[mid]==1) {
					mid++;
				}
				else {
					temp = arr[mid];
					arr[mid] = arr[high];
					arr[high] = temp;
					high--;
				}
		}
		return arr;
	}
}
