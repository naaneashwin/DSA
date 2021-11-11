package TwoDimentionalArrays;

public class SumOfDiagonalElementsOppSide {
		public static void main(String[] args) {
			int[][] arr = {{11,12,13,14},{15,16,17,18},{19,20,21,22},{23,24,25,26}};
			int sum=0;
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					if(i+j==arr.length-1) {
						sum += arr[i][j];
					}
				}
			}
			System.out.println(sum);
	}
}
