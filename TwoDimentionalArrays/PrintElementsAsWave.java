package TwoDimentionalArrays;

public class PrintElementsAsWave {
	public static void main(String[] args) {
		int[][] arr = {{11,12,13,14},{15,16,17,18},{19,20,21,22},{23,24,25,26}};
		antiClockwise(1,0,arr.length-1,0,arr[0].length-1,arr);
		System.out.println();
		clockwise(1,0,arr.length-1,0,arr[0].length-1,arr);
	}
	private static void clockwise(int direction,int top, int bottom, int left, int right, int[][] arr) {
		while(left<=right) {
			if(direction%2==0) {
				for(int i=top; i<=bottom; i++) {
					System.out.print(arr[i][left]+" ");
				}
				left++;
				direction++;
			}
			else{
				for(int i=bottom; i>=top; i--) {
					System.out.print(arr[i][left]+" ");
				}
				left++;
				direction++;
			}
		}
	}
	private static void antiClockwise(int direction,int top, int bottom, int left, int right, int[][] arr) {
		while(left<=right) {
			if(direction%2!=0) {
				for(int i=top; i<=bottom; i++) {
					System.out.print(arr[i][left]+" ");
				}
				left++;
				direction++;
			}
			else{
				for(int i=bottom; i>=top; i--) {
					System.out.print(arr[i][left]+" ");
				}
				left++;
				direction++;
			}
		}
	}
}