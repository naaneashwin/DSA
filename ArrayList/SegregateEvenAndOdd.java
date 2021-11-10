package ArrayList;

public class SegregateEvenAndOdd {
//segregate even and odd in the same array, even at front
	public static void main(String[] args) {
		int[] arr = {1,2,6,3,4,9,8,7,6};
		int i=0, j=arr.length-1;
		while(i<=j) {
			switch(arr[i]%2){
				case 0 :{
					i++;
					break;
				}
				case 1:{
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					j--;
					break;
				}
			}
		}
		for(int k: arr) System.out.print(k+ " ");
	}
}
