package Sorting;

public class BubbleSort {
	public static int[] sort(int[] num) {
		for(int i=0; i<num.length-1; i++) {
			boolean flag = false;
			for(int j=0; j<num.length-i-1; j++) {
				if(num[j]>num[j+1]) {
					int temp = num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
					flag = true;
				}
			}
			if(!flag) break;
		}
		
		return num;
	}
	public static char[] sort(char[] charArray) {
		for(int i=0; i<charArray.length-1; i++) {
			boolean flag = false;
			for(int j=0; j<charArray.length-i-1; j++) {
				if(charArray[j]>charArray[j+1]) {
					char temp = charArray[j];
					charArray[j]=charArray[j+1];
					charArray[j+1]=temp;
					flag = true;
				}
			}
			if(!flag) break;
		}
		
		return charArray;
	}
}
