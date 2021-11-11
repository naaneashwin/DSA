package TwoDimentionalArrays;

public class PrintElementsSpirally {
	public static void main(String[] args) {
		int[][] arr = {{11,12,13,14},{15,16,17,18},{19,20,21,22},{23,24,25,26}};
		clockwise(0,arr.length-1,0,arr[0].length-1,0,arr);
		System.out.println();
		antiClockwise(0,arr.length-1,0,arr[0].length-1,0,arr);
	}
	private static void clockwise(int top, int bottom, int left, int right, int direction, int[][] arr) {
		while(top<=bottom && left<=right) {
			if(direction==0) {
				for(int i=left; i<=right; i++) {
					System.out.print(arr[top][i] + " ");
				}
				top++;
				direction++;
			}
			else if(direction==1) {
				for(int i=top; i<=bottom; i++) {
					System.out.print(arr[i][right]+ " ");
				}
				right--;
				direction++;
			}
			else if(direction ==2) {
				for(int i=right; i>=left; i--) {
					System.out.print(arr[bottom][i]+ " ");
				}
				bottom--;
				direction++;
			}
			else {
				for(int i=bottom; i>=top; i--) {
					System.out.print(arr[i][left]+ " ");
				}
				left++;
				direction-=3;
			}
		}
	}
	private static void antiClockwise(int top, int bottom, int left, int right, int direction, int[][] arr) {
		while(left<=right && top<=bottom) {
			if(direction==0) {
				for(int i=top; i<=bottom; i++) {
					System.out.print(arr[i][left]+" ");
				}
				left++;
				direction++;
			}
			else if(direction==1) {
				for(int i=left; i<=right; i++) {
					System.out.print(arr[bottom][i]+" ");
				}
				bottom--;
				direction++;
			}
			else if(direction==2) {
				for(int i=bottom; i>=top; i--) {
					System.out.print(arr[i][right]+" ");
				}
				right--;
				direction++;
			}
			else {
				for(int i=right; i>=left; i--) {
					System.out.print(arr[top][i]+" ");
				}
				top++;
				direction-=3;
			}
		}
	}
}
